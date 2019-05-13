package id.nexcloud.nexsurvey.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import id.nexcloud.nexsurvey.security.builder.SecurityResponseBuilder;
import id.nexcloud.nexsurvey.security.service.ResponseBuilderHelper;
import id.nexcloud.nexsurvey.security.service.SecurityDetailsService;

@Service("securityDetailsService")
public class SecurityDetailsServiceImpl implements SecurityDetailsService{

	@Autowired
	private MessageSource messageSource;
	@Override
	public ResponseBuilderHelper getSecurityResponseBuilder() {
		// TODO Auto-generated method stub
		return new SecurityResponseBuilder(messageSource);
	}
	
	
}
