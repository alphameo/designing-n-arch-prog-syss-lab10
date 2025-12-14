package com.github.alphameo.university;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class University {

	private List<Faculty> faculties = new ArrayList<>();
	private List<Employee> employees = new ArrayList<>();

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

	@Override
	public String toString() {
		return "University{faculties=" + faculties + "\n\nemployees="
				+ employees.stream()
						.map(Employee::toString)
						.collect(Collectors.joining("\n", "[\n", "\n]"))
				+ "}";
	}

}
