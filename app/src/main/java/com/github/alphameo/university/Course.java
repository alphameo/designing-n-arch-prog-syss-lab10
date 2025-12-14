package com.github.alphameo.university;

public class Course {

	private String id;
	private String name;

	/**
	 * in hours
	 */
	private int weeklyDuration;

	public Course(String id, String name, int weeklyDuration) {
		this.id = id;
		this.name = name;
		this.weeklyDuration = weeklyDuration;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getWeeklyDuration() {
		return this.weeklyDuration;
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
	 * @param duration in hours
	 */
	public void changeWeeklyDuration(int duration) {
		this.weeklyDuration = duration;
	}

	@Override
	public String toString() {
		return "Course{id=" + id + ", name=" + name + ", weeklyDuration=" + weeklyDuration + "}";
	}

}
