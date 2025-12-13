package com.github.alphameo.university;

public class Institute {

	private String name;
	private String address;

	public Institute() {
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param String
	 */
	public void rename(String name) {
		this.name = name;
	}

}
