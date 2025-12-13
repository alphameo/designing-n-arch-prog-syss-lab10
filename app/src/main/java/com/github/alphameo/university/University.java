package com.github.alphameo.university;

import java.util.List;

public class University {

	private List<Faculty> faculties;
	private List<Employee> employees;

	public List<Faculty> getFaculties() {
		return this.faculties;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	/**
	 * 
	 * @param employee
	 */
	public void hireEmployee(Employee employee) {
		this.employees.add(employee);
	}

	/**
	 * 
	 * @param employee
	 */
	public void fireEmployee(Employee employee) {
		this.employees.remove(employee);
	}

	/**
	 * 
	 * @param faculty
	 */
	public void addFaculty(Faculty faculty) {
		this.faculties.add(faculty);
	}

	/**
	 * 
	 * @param faculty
	 */
	public void removeFaculty(Faculty faculty) {
		this.faculties.remove(faculty);
	}

}
