package com.qa.person;

import java.util.*;


public class Runner {

	public static void main(String[] args) {

		Person Jake = new Person("Jake", 21, "Engineer");
		Person Bob = new Person("Bob", 26, "Doctor");
		Person Harry = new Person("Harry", 29, "Lawyer");

		List<Person> people = new ArrayList<>();

		people.add(Jake);
		people.add(Bob);
		people.add(Harry);

        Scanner scan = new Scanner(System.in);
		
        //Input for the name
        System.out.println("Who do you want to find?");
        String scanName = scan.nextLine();
		
        //Searches for the typed name 
        System.out.println("Searching for: " + scanName);
        Person.findPerson(scanName, people);
        scan.close();
		
        // For printing the whole list
        Person.printall(people);


	}

}
