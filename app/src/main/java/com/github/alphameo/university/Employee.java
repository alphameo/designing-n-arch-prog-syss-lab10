package com.github.alphameo.university;

public abstract class Employee {

	private String name;
	private String socialSecurityNumber;
	private String email;

	public String getName() {
		return this.name;
	}

	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param name
	 */
	public void rename(String name) {
		// TODO - implement Employee.rename
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void changeEmail(String name) {
		// TODO - implement Employee.changeEmail
		throw new UnsupportedOperationException();
	}

}