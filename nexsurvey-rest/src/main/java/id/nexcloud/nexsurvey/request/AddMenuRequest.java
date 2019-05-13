package id.nexcloud.nexsurvey.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddMenuRequest {

	@NotBlank(message = "field.required")
	private String code;

	@NotBlank(message = "field.required")
	private String name;

}
