package id.nexcloud.nexsurvey.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import id.nexcloud.nexsurvey.security.service.SecurityDetailsService;
import id.nexcloud.nexsurvey.security.JwtSetting;
import id.nexcloud.nexsurvey.security.statis.CommonHttpStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestAuthenticationEntryPoint.class);

	private SecurityDetailsService securityDetailsService;
	private ObjectMapper mapper;
	private JwtSetting jwtSetting;

	@Autowired
	public RestAuthenticationEntryPoint(SecurityDetailsService securityDetailsService, ObjectMapper mapper,
			JwtSetting jwtSetting) {
		this.securityDetailsService = securityDetailsService;
		this.mapper = mapper;
		this.jwtSetting = jwtSetting;
	}

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authenticationException) throws IOException, ServletException {

		LOGGER.error(String.format("[%s] %s", jwtSetting.getIdentityPrefix(), authenticationException.getMessage()),
				authenticationException);

		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);

		mapper.writeValue(response.getWriter(), securityDetailsService.getSecurityResponseBuilder()
				.setCommonHttpStatus(CommonHttpStatus.AUTHENTICATION_FAILED).build());
	}

}
