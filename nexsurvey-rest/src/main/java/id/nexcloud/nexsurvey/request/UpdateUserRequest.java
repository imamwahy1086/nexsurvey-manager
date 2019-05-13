package id.nexcloud.nexsurvey.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UpdateUserRequest {

	@NotNull(message = "field.required")
	private Long id;

	@NotBlank(message = "field.required")
	private String username;

	@NotBlank(message = "field.required")
	private String language;

}
