package factory;

import fitness.Person;

public class PersonCreator {
	
	public static Person createPerson(String name, String phone) {
		
		return new Person(name, phone); 
		
	}

}
