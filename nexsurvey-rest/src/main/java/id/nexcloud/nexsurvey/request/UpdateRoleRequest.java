package id.nexcloud.nexsurvey.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UpdateRoleRequest {

    @NotNull(message = "field.required")
    private Long id;

	private String code;

    @NotBlank(message = "field.required")
    private String name;

}
