package id.nexcloud.nexsurvey.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUserRequest {

	@NotBlank(message = "field.required")
	private String username;

	private String firstName;

	private String lastName;

	@NotBlank(message = "field.required")
	private String password;

	@NotBlank(message = "field.required")
	private String confirmPassword;

	@NotBlank(message = "field.required")
	private String language;

	@NotNull(message = "field.required")
	private Long roleId;

}
