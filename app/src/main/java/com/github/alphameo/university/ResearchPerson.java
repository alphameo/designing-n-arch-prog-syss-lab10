package com.github.alphameo.university;

import java.util.List;

public class ResearchPerson extends Employee {

	private List<Institute> institutes;
	private String researchArea;

	public ResearchPerson(String name, String socialSecurityNumber, String email, String researchArea) {
		super(name, socialSecurityNumber, email);
		this.researchArea = researchArea;
	}

	public List<Institute> getInstitutes() {
		return this.institutes;
	}

	public String getResearchArea() {
		return this.researchArea;
	}

	/**
	 * 
	 * @param institute
	 */
	public void assignToInstitute(Institute institute) {
		institutes.add(institute);
	}

	/**
	 * 
	 * @param institute
	 */
	public void unassignFromInstitute(Institute institute) {
		this.institutes.remove(institute);
	}

	/**
	 * 
	 * @param researchArea
	 */
	public void replaceResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

}
