package id.nexcloud.nexsurvey.security.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import id.nexcloud.nexsurvey.security.rest.response.ResponseApi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Template for all HTTP response body.
 */
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ResponseDto implements ResponseApi {

	private Date timestamp;
	private Object content;
	private PageMetaDataDto pageMetaData;
	private ResponseStatusDto status;

	public ResponseDto(Date timestamp, Object content, ResponseStatusDto status) {
		this.timestamp = timestamp;
		this.content = content;
		this.status = status;
	}

	/**
	 * Define page meta data response for pagination API.
	 */
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(Include.NON_NULL)
	public static class PageMetaDataDto {
		private long totalElements;
		private int totalPages;
		private int size;
		private int number;
		private int numberOfElements;
	}

	/**
	 * Define response status of HTTP response.
	 */
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResponseStatusDto {
		private String code;
		private String type;
		private String message;
	}

}
