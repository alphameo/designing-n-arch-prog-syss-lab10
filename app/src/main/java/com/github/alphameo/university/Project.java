package com.github.alphameo.university;

import java.time.LocalDateTime;

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
		return this.endDate;
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
	 * @param startingDate
	 */
	public void changeStartingDate(LocalDateTime startingDate) {
		this.startingDate = startingDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void changeEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

}
