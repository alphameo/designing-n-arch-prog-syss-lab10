package com.github.alphameo.university;

public class ProjectParticipation {

	/**
	 * in hours
	 */
	private int duration;
	private Project project;
	private ResearchPerson researcher;

	public int getDuration() {
		return this.duration;
	}

	public Project getProject() {
		return this.project;
	}

	public ResearchPerson getResearcher() {
		return this.researcher;
	}

	/**
	 * 
	 * @param duration in hours
	 */
	public void changeDuration(int duration) {
		this.duration = duration;
	}

}
