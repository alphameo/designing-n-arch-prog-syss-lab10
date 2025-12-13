package com.github.alphameo.university;

public class Project {

	private String name;
	private LocalDateTime startingDate;
	private LocalDateTime endDate;

	public String getName() {
		return this.name;
	}

	public LocalDateTime getStartingDate() {
		return this.startingDate;
	}

	public LocalDateTime getEndDate() {

	}

	/**
	 * 
	 * @param name
	 */
	public void rename(String name) {
		// TODO - implement Project.rename
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param startingDate
	 */
	public void changeStartingDate(LocalDateTime startingDate) {
		// TODO - implement Project.changeStartingDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param endDate
	 */
	public void changeEndDate(LocalDateTime endDate) {
		// TODO - implement Project.changeEndDate
		throw new UnsupportedOperationException();
	}

}