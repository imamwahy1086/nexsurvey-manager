package id.nexcloud.nexsurvey.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuResponse {

	private Long id;
	private String code;
	private String name;
	private String icon;
	private String url;
	private Long parent;
	private int sequence;
	private int level;

}
