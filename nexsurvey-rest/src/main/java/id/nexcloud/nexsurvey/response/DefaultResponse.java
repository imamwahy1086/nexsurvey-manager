package id.nexcloud.nexsurvey.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("rawtypes")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefaultResponse<D> implements NexResponse {

    private String code;

    private String status;

    private D content;

    private NexPageInfo pageInfo;

    private String error;

}
