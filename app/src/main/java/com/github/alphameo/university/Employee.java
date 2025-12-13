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
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 */
	public void changeEmail(String email) {
		this.email = email;
	}

}
