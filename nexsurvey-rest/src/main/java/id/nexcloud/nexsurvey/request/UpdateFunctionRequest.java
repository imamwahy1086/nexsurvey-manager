package id.nexcloud.nexsurvey.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UpdateFunctionRequest {

    @NotNull(message = "field.required")
    private Long id;

    @NotBlank(message = "field.required")
    private String code;

    @NotBlank(message = "field.required")
    private String name;

}
