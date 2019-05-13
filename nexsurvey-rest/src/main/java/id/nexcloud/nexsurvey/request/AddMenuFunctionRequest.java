package id.nexcloud.nexsurvey.request;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AddMenuFunctionRequest {

	@NotNull(message = "field.required")
	private Long menuId;

	@NotEmpty(message = "field.required")
	private List<Long> functionIds;

}
