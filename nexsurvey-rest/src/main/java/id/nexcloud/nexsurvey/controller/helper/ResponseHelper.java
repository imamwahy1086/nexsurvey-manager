package id.nexcloud.nexsurvey.controller.helper;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import id.nexcloud.nexsurvey.response.DefaultResponse;
import id.nexcloud.nexsurvey.response.NexPageInfo;
import id.nexcloud.nexsurvey.response.NexResponse;
import id.nexcloud.nexsurvey.statis.MessageHolder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings({ "rawtypes", "unchecked" })
public final class ResponseHelper {

	private ResponseHelper() {
	}

	public static NexResponse ok() {
		return DefaultResponse.builder().code(MessageHolder.SUCCESS.getCode())
				.status(HttpStatus.Series.SUCCESSFUL.name()).build();
	}

	public static <D> NexResponse<D> ok(D content) {
		DefaultResponse response = (DefaultResponse) ok();
		response.setContent(content);
		return response;
	}

	public static <D> NexResponse<D> ok(Page<D> page) {
		DefaultResponse response = (DefaultResponse) ok(page.getContent());
		response.setPageInfo(NexPageInfo.builder().page(page.getNumber()).itemsPerPage(page.getSize())
				.totalItems(page.getTotalElements()).totalPages(page.getTotalPages()).build());
		return response;
	}

	public static NexResponse created() {
		return DefaultResponse.builder().code(MessageHolder.CREATED.getCode())
				.status(HttpStatus.Series.SUCCESSFUL.name()).build();
	}

	public static NexResponse accepted() {
		return DefaultResponse.builder().code(MessageHolder.REQUEST_PROCESSED.getCode())
				.status(HttpStatus.Series.SUCCESSFUL.name()).build();
	}

	public static NexResponse error(String code, String status, String error) {
		return DefaultResponse.builder().code(code).status(status).error(error).build();
	}

	public static NexResponse error(String code, String error, List<String> details) {
		log.info("Error is: {}", error);
		return error(code, details);
	}

	public static NexResponse error(String code, List<String> details) {
		return DefaultResponse.builder().code(code).status(HttpStatus.Series.SERVER_ERROR.name())
				.error(details.toString()).build();
	}

	public static NexResponse error(String code, Map<String, List<String>> errors) {
		return DefaultResponse.builder().code(code).status(HttpStatus.Series.SERVER_ERROR.name())
				.error(errors.toString()).build();
	}

}