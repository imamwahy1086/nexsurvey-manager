package id.nexcloud.nexsurvey.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleResponse {

	private Long id;
	private String code;
	private String name;

}
