package id.nexcloud.nexsurvey.security;

import java.util.Arrays;
import java.util.List;

import id.nexcloud.nexsurvey.security.auth.token.SkipPathRequestMatcher;
import id.nexcloud.nexsurvey.security.filter.filterToken;
import id.nexcloud.nexsurvey.security.service.SecurityDetailsService;
import id.nexcloud.nexsurvey.security.JwtSetting;
import id.nexcloud.nexsurvey.security.statis.WebSecuritySupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private JwtSetting jwtSetting;

	@Autowired
	private SecurityDetailsService securityDetailsService;

	@Autowired
	private ObjectMapper objectMapper;
	
	public WebSecurityConfig() {
		super();
//		SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("=========== CHECK CONFIG ==========");
		http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint())
		.accessDeniedHandler(accessDeniedHandler()).and().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
		.antMatchers(WebSecuritySupport.BASED_HEALTH_URL.getValue()).permitAll()
//		.antMatchers(WebSecuritySupport.JWT_BASED_LOGIN_ENTRY_POINT.getValue()).permitAll()
		
		.anyRequest().permitAll();
//		http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint())
//		.accessDeniedHandler(accessDeniedHandler()).and().sessionManagement()
//		.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
//		.antMatchers(WebSecuritySupport.BASED_HEALTH_URL.getValue()).permitAll()
//		.antMatchers(WebSecuritySupport.JWT_BASED_LOGIN_ENTRY_POINT.getValue()).permitAll();
		
//				.anyRequest().denyAll()
//				.and().addFilterBefore(filter, beforeFilter);
	}
//	protected JwtTokenAuthenticationProcessingFilter buildJwtTokenAuthenticationProcessingFilter() {
//		List<String> pathsToSkip = requestAntPathsToPermitAll();
//		SkipPathRequestMatcher matcher = new SkipPathRequestMatcher(pathsToSkip,
//				WebSecuritySupport.BASED_AUTH_ENTRY_POINT.getValue());
//		JwtTokenAuthenticationProcessingFilter filter = new JwtTokenAuthenticationProcessingFilter(
//				authenticationFailureHandler(), tokenExtractor, matcher);
//		filter.setAuthenticationManager(authenticationManager);
//		return filter;
//	}


	protected List<String> requestAntPathsToPermitAll() {
		return Arrays.asList(WebSecuritySupport.BASED_HEALTH_URL.getValue(),
				WebSecuritySupport.JWT_BASED_LOGIN_ENTRY_POINT.getValue(), "/document/test");
	}

	protected AccessDeniedHandler accessDeniedHandler() {
		return new RestAccessDeniedHandler(securityDetailsService, objectMapper, jwtSetting);
	}

	protected AuthenticationEntryPoint authenticationEntryPoint() {
		return new RestAuthenticationEntryPoint(securityDetailsService, objectMapper, jwtSetting);
	}
	
	@Bean
	public FilterRegistrationBean<filterToken> filtertkns(){
		FilterRegistrationBean<filterToken> filterbean = new FilterRegistrationBean<filterToken>();
		filterToken token = new filterToken();
		System.out.println("filterBean");
		filterbean.setFilter(token);
		filterbean.addUrlPatterns("/*");
		return filterbean;
	}
}
