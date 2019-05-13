package id.nexcloud.nexsurvey.security.builder;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import id.nexcloud.nexsurvey.security.dto.ResponseDto;
import id.nexcloud.nexsurvey.security.dto.ResponseDto.ResponseStatusDto;
import id.nexcloud.nexsurvey.security.rest.response.ResponseApi;
import id.nexcloud.nexsurvey.security.service.ResponseBuilderHelper;
import id.nexcloud.nexsurvey.security.statis.CommonHttpStatus;

/**
 * Class builder used to create {@link GenericResponse} security. This class
 * extends {@link ResponseBuilderHelper}.
 */
public class SecurityResponseBuilder extends ResponseBuilderHelper {

	private Date timestamp;
	private Object data;
	private CommonHttpStatus commonHttpStatus;
	private Object[] args;
	private MessageSource messageSource;

	public SecurityResponseBuilder(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public SecurityResponseBuilder setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	@Override
	public SecurityResponseBuilder setData(Object data) {
		this.data = data;
		return this;
	}

	/**
	 * @param genericStatus
	 *            the genericStatus to set
	 */
	@Override
	public SecurityResponseBuilder setCommonHttpStatus(CommonHttpStatus commonHttpStatus) {
		this.commonHttpStatus = commonHttpStatus;
		return this;
	}

	/**
	 * @param args
	 *            the args to set
	 */
	@Override
	public SecurityResponseBuilder setArgs(Object[] args) {
		this.args = args;
		return this;
	}

	@Override
	public ResponseApi build() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();

		return new ResponseDto(timestamp == null ? new Date() : timestamp, data, new ResponseStatusDto(
				commonHttpStatus.getCode(), commonHttpStatus.getType(),
				messageSource.getMessage(commonHttpStatus.getKey(), args, RequestContextUtils.getLocale(request))));
	}
}

