package id.nexcloud.nexsurvey.security.statis;

public enum WebSecuritySupport {

	// @formatter:off
	DEFAULT_ENUM(""),
	BASED_AUTH_ENTRY_POINT("/**"),
	BASED_HEALTH_URL("/health"),
	JWT_TOKEN_HEADER_PARAM("Authorization"),
	JWT_BASED_LOGIN_ENTRY_POINT("/document/test");

	private final String value;

	private WebSecuritySupport(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static WebSecuritySupport getEnum(String value) {
        for(WebSecuritySupport val : values()) {
        	if(val.getValue().equalsIgnoreCase(value)) {
        		return val;
        	}
        }
        return WebSecuritySupport.DEFAULT_ENUM;
    }
}
