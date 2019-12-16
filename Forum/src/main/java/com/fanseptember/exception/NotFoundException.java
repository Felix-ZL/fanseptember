package com.fanseptember.exception;

public class NotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7025692716644097993L;

	public NotFoundException(String resourceName, Long id) {
		super("Could not find " + resourceName + " " + id);
	}
}
