package com.github.alphameo.university;

public class ProjectParticipation {

	/**
	 * in hours
	 */
	private int duration;
	private Project project;
	private ResearchPerson researcher;

	public ProjectParticipation(int duration, Project project, ResearchPerson researcher) {
		this.duration = duration;
		this.project = project;
		this.researcher = researcher;
	}

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

	@Override
	public String toString() {
		return "ProjectParticipation{duration=" + duration + ", project=" + project + ", researcher=" + researcher
				+ "}";
	}

}
