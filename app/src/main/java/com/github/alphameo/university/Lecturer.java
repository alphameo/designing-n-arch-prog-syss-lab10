package com.github.alphameo.university;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchPerson {

	private List<Course> courses;

	public Lecturer(String name, String socialSecurityNumber, String email, String researchArea) {
		super(name, socialSecurityNumber, email, researchArea);
		this.courses = new ArrayList<>();
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		this.courses.add(course);
	}

	/**
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		this.courses.remove(course);
	}

	@Override
	public String toString() {
		return "Lecturer{" + super.toString() + ", courses=" + courses + "}";
	}

}
