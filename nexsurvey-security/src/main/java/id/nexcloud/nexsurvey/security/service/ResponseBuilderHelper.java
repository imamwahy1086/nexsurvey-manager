package id.nexcloud.nexsurvey.security.service;

import id.nexcloud.nexsurvey.security.builder.GenericBuilder;
import id.nexcloud.nexsurvey.security.rest.response.ResponseApi;
import id.nexcloud.nexsurvey.security.statis.CommonHttpStatus;

public abstract class ResponseBuilderHelper implements GenericBuilder<ResponseApi> {

	/**
	 * Method used to build data.
	 * 
	 * @param data
	 *            {@link Object} Content of data.
	 * @return {@link ResponseBuilderHelper} Builder helper.
	 */
	public abstract ResponseBuilderHelper setData(Object data);

	/**
	 * Method used to build generic status.
	 * 
	 * @param genericStatus
	 *            {@link GenericStatus}
	 * @return {@link ResponseBuilderHelper} Builder helper.
	 */
	public abstract ResponseBuilderHelper setCommonHttpStatus(CommonHttpStatus commonHttpStatus);

	/**
	 * Method used to build arguments.
	 * 
	 * @param args
	 *            {@link Object}[] Additional information.
	 * @return {@link ResponseBuilderHelper} Builder helper.
	 */
	public abstract ResponseBuilderHelper setArgs(Object[] args);

}
