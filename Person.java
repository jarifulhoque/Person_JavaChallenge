package com.qa.person;

import java.util.*;

public class Person {

	// attributes

	private String name;
	private int age;
	private String jobTitle;

	// default constructor

	public Person() {
	}

	// everything constructor

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	// getters & setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// toString

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}

	public static void findPerson(String scanName, List people) {
		for (Object p : people) {
			String s = p.toString();
			if (s.contains(scanName)) {
				System.out.println(s);
				return;
			}
		}

		System.out.println("Sorry- Does not exist.");
	}

	// Foreach loop printing the whole list
	public static void printall(List people) {
		System.out.println("\n All records: \n");
		for (Object p : people) {
			System.out.println(p);
		}

		
	}

}
