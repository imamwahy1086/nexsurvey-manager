package id.nexcloud.nexsurvey.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NexPageInfo {

    private Integer page;

    private Integer totalPages;

    private Integer itemsPerPage;

    private Long totalItems;

}
