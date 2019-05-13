package id.nexcloud.nexsurvey.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UpdateMenuRequest {

	@NotNull(message = "field.required")
	private Long id;

	@NotBlank(message = "field.required")
	private String name;
	
	@NotBlank(message = "field.required")
	private String icon;
	
	@NotBlank(message = "field.required")
	private String url;

}
