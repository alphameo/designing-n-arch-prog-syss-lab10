package com.github.alphameo.university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

	private String name;
	private Employee dean;
	private List<Institute> institutes;

	public Faculty(String name, Employee dean) {
		this.name = name;
		this.dean = dean;
		this.institutes = new ArrayList<>();
	}

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
		this.name = name;
	}

	/**
	 * 
	 * @param dean
	 */
	public void replaceDean(Employee dean) {
		this.dean = dean;
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		this.institutes.add(institute);
	}

	/**
	 * 
	 * @param institute
	 */
	public void removeInstitute(Institute institute) {
		this.institutes.remove(institute);
	}

	@Override
	public String toString() {
		return "Faculty{name=" + name + ", dean=" + dean.getName() + ", institutes=" + institutes + "}";
	}

}
