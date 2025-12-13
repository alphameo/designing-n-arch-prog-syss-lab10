package com.github.alphameo.university;

import java.util.List;

public abstract class ResearchPerson extends Employee {

	private List<Institute> institutes;
	private String researchArea;

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
		// TODO - implement ResearchPerson.assignToInstitute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param institute
	 */
	public void unassignFromInstitute(Institute institute) {
		// TODO - implement ResearchPerson.unassignFromInstitute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchArea
	 */
	public void replaceResearchArea(String researchArea) {
		// TODO - implement ResearchPerson.replaceResearchArea
		throw new UnsupportedOperationException();
	}

}
