package id.nexcloud.nexsurvey.security.builder;


public interface GenericBuilder<T> {

	/**
	 * Method used to build an object.
	 * 
	 * @return Object class.
	 */
	T build();
}
