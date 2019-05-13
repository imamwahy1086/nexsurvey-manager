package id.nexcloud.nexsurvey.security.statis;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Provide custom HTTP status code.
 */
@AllArgsConstructor
@Getter
public enum CommonHttpStatus {

	// @formatter:off
	
	/**
	 * Global success response.
	 */
	SUCCESS("SR-G", "SUCCESS", "msg.httpstatus.success"),
	REQUEST_PROCESSED("SR-RP", "REQUEST_PROCESSED", "msg.httpstatus.request.processed"),
	TOKEN_CREATED("SR-TC", "TOKEN_CREATED", "msg.httpstatus.token.created"),
	DATA_CREATED("SR-DC", "DATA_CREATED", "msg.httpstatus.data.created"),
	DATA_UPDATED("SR-DU", "DATA_UPDATED", "msg.httpstatus.data.updated"),
	DATA_DELETED("SR-DD", "DATA_DELETED", "msg.httpstatus.data.deleted"),
	
	/**
	 * Global error response.
	 */
	ERROR_SYSTEM("ER-S", "ERROR_SYSTEM", "msg.httpstatus.error.system"),
	INVALID_LICENSE("ER-IL", "INVALID_LICENSE", "msg.httpstatus.error.invalidlicense"),
	INTERNAL_SERVER_ERROR("ER-ISE", "INTERNAL_SERVER_ERROR", "msg.httpstatus.error.internalservererror"),
	INVALID_ARGUMENT("ER-IA", "INVALID_ARGUMENT", "msg.httpstatus.error.invalidargument"),
	MESSAGE_NOT_READABLE("ER-MNR", "MESSAGE_NOT_READABLE", "msg.httpstatus.error.messagenotreadable"),
	METHOD_NOT_ALLOWED("ER-MNA", "METHOD_NOT_ALLOWED", "msg.httpstatus.error.methodnotallowed"),
	MISSING_REQUEST_PARAMETER("ER-MRP", "MISSING_REQUEST_PARAMETER", "msg.httpstatus.error.missingrequestparameter"),
	URL_NOT_FOUND("ER-UNF", "URL_NOT_FOUND", "msg.httpstatus.error.notfound"),
	UNSUPPORTED_MEDIA_TYPE("ER-UMT", "UNSUPPORTED_MEDIA_TYPE", "msg.httpstatus.error.unsupportedmediatype"),
	DATA_ALREADY_EXIST("ER-DAE", "DATA_ALREADY_EXIST", "msg.httpstatus.error.data.alreadyexist"),
	DATA_NOT_EXIST("ER-DNE", "DATA_NOT_EXIST", "msg.httpstatus.error.data.notexist"),
	DATA_WAS_CHANGED("ER-DWC", "DATA_WAS_CHANGED", "msg.httpstatus.error.data.waschanged"),
	DATA_INTEGRITY_VIOLATED("ER-DIV", "DATA_INTEGRITY_VIOLATED", "msg.httpstatus.error.data.integrityviolated"),
	
	/**
	 * Error response for restricted access (security).
	 */
	AUTHENTICATION_FAILED("ER-SEC-AF", "AUTHENTICATION_FAILED", "msg.httpstatus.error.authenticationfailed"),
	AUTHENTICATION_METHOD_NOT_SUPPORTED("ER-SEC-AMNS", "AUTHENTICATION_METHOD_NOT_SUPPORTED", "msg.httpstatus.error.authenticationmethodnotsupported"),
	FORBIDDEN("ER-SEC-F", "FORBIDDEN", "msg.httpstatus.error.forbidden"),
	INVALID_AUTHENTICATION("ER-SEC-IA", "INVALID_AUTHENTICATION", "msg.httpstatus.error.invalidauthentication"),
	INVALID_CLIENT("ER-SEC-IC", "INVALID_CLIENT", "msg.httpstatus.error.invalidclient"),
	INVALID_GRANT("ER-SEC-IG", "INVALID_GRANT", "msg.httpstatus.error.invalidgrant"),
	INVALID_REQUEST("ER-SEC-IR", "INVALID_REQUEST", "msg.httpstatus.error.invalidrequest"),
	INVALID_SCOPE("ER-SEC-IS", "INVALID_SCOPE", "msg.httpstatus.error.invalidscope"),
	INVALID_TOKEN("ER-SEC-IT", "INVALID_TOKEN", "msg.httpstatus.error.invalidtoken"),
	INVALID_USERNAME_PASSWORD("ER-IUP", "INVALID_USERNAME_PASSWORD", "msg.httpstatus.error.invalidusernamepassword"),
	REDIRECT_URI_MISMATCH("ER-SEC-RUM", "REDIRECT_URI_MISMATCH", "msg.httpstatus.error.redirectmismatch"),
	TOKEN_EXPIRED("ER-TE", "TOKEN_EXPIRED", "msg.httpstatus.error.tokenexpired"),
	UNAUTHORIZED_CLIENT("ER-SEC-UC", "UNAUTHORIZED_CLIENT", "msg.httpstatus.error.unauthorizedclient"),
	UNSUPPORTED_GRANT_TYPE("ER-SEC-UGT", "UNSUPPORTED_GRANT_TYPE", "msg.httpstatus.error.unsupportedgranttype"),
	UNSUPPORTED_RESPONSE_TYPE("ER-SEC-URT", "UNSUPPORTED_RESPONSE_TYPE", "msg.httpstatus.error.unsupportedresponsetype");
	
	private final String code;
	private final String type;
	private final String key;
	
	// @formatter:on

}
