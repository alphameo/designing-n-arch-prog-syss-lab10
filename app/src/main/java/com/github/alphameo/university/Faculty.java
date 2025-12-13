package com.github.alphameo.university;

public class Faculty {

	private String name;
	private Employee dean;
	private List<Institute> institutes;

	public String getName() {
		return this.name;
	}

	public Employee getDean() {
		return this.dean;
	}

	public List<Institute> getInstitutes() {
		return this.institutes;
	}

	/**
	 * 
	 * @param name
	 */
	public void rename(String name) {
		// TODO - implement Faculty.rename
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dean
	 */
	public void replaceDean(Employee dean) {
		// TODO - implement Faculty.replaceDean
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		// TODO - implement Faculty.addInstitute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param institute
	 */
	public void removeInstitute(Institute institute) {
		// TODO - implement Faculty.removeInstitute
		throw new UnsupportedOperationException();
	}

}