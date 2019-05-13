package id.nexcloud.nexsurvey.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AddFunctionRequest {

    @NotBlank(message = "field.required")
    private String code;

    @NotBlank(message = "field.required")
    private String name;

}
