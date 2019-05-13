package id.nexcloud.nexsurvey.statis;

import lombok.Getter;

@Getter
public enum MessageHolder {

	SUCCESS("SR-OK", "system.ok", null), CREATED("SR-SC", "system.created", null),
	REQUEST_PROCESSED("SR-RP", "system.request-processed", null),
	INTERNAL_SERVER_ERROR("ER-ISE", "system.server-error", null),
	INVALID_REQUEST_PARAMETER("ER-IRP", "system.invalid-request-param", null),
	MISSING_REQUEST_PARAMETER("ER-MRP", "system.missing-request-param", null),
	ELASTICSEARCH_NOT_AVAILABLE("ER-ENA", "system.elastic-search.not-available", null),
	MESSAGE_NOT_READABLE("ER-MNR", "system.http-message.not-readable", null),
	INVALID_ARGUMENT("ER-IA", "system.invalid-argument", null),
	INVALID_EXCEL_CONTENT("ER-IEC", "file.content.invalid", new String[] { "excel" }),

	JOB_NOT_EXIST(Constant.ER_DNE_CODE, Constant.ER_DNE_KEY, new String[] { "entity.job" }),

	DATA_ALREADY_EXISTS("ER-DAE", "Data is already exist in system", null),
	ROLE_NOT_EXIST("ER-RNE", "Role not exist", null), DATA_NOT_FOUND("ER-DNF", "Data not found", null),

	FILE_CANNOT_EMPTY("ER-FCE", "file.cannot.empty", null),
	FILE_EXTENSION_NOT_MATCH("ER-ENM", "File format does not match the file extension", null);

	private String code;
	private String key;
	private String[] args;

	private MessageHolder(String code, String key, String[] args) {
		this.key = key;
		this.code = code;
		this.args = args;
	}

	private static class Constant {
		public static final String ER_DNE_CODE = "ER-DNE";
		public static final String ER_DNE_KEY = "repo.data.not-exist";
	}

}
