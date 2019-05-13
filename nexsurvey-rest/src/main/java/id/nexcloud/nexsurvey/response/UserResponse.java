package id.nexcloud.nexsurvey.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {

	private Long id;
	private String username;
	private String role;
	private String password;
	private String language;

}
