package id.nexcloud.nexsurvey.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

/**
 * Class that contains parameter setting of JWT configuration.
 */
@Configuration
@PropertySource("classpath:core-jwt-config.properties")
@ConfigurationProperties(prefix = "core.security.jwt")
@Getter
@Setter
public class JwtSetting {

	/**
	 * {@link JwtToken} will expire after this time.
	 */
	private Integer tokenExpirationTime;

	/**
	 * Identity prefix.
	 */
	private String identityPrefix = "SECURITY-JWT";

	/**
	 * Token issuer.
	 */
	private String tokenIssuer;

	/**
	 * Key is used to sign {@link JwtToken}.
	 */
	private String tokenSigningKey;
}
