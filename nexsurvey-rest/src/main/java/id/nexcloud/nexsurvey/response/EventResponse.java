package id.nexcloud.nexsurvey.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventResponse {

	private Long id;
	private String name;
	private Date eventDate;
	private String location;
	private String description;

}
