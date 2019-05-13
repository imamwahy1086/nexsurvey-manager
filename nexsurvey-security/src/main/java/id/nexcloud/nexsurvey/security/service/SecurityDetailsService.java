package id.nexcloud.nexsurvey.security.service;

import org.springframework.stereotype.Service;

public interface SecurityDetailsService {

	/**
	 * Method used to get response builder to build a generic response.
	 * 
	 * @return {@link ResponseBuilderHelper}
	 */
	ResponseBuilderHelper getSecurityResponseBuilder();

}
