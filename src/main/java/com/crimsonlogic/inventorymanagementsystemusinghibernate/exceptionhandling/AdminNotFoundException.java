package com.crimsonlogic.inventorymanagementsystemusinghibernate.exceptionhandling;

public class AdminNotFoundException extends Exception  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -470724828188546022L;
	public AdminNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}

}
