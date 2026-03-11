package Problem5;

import java.util.Vector;

public class PersonRegistry {
	private Vector<Person> people;
	
	public PersonRegistry() {
		people = new Vector<>();
	}
	
	public void addPerson(Person person) {
		people.add(person);
		System.out.println(person.getName() + " was added.");
	}
	
	public void removePerson(Person person){
		people.remove(person);
		System.out.println(person.getName() + " was removed.");
	}
	
	 public void printPeopleWithPets() {
	        for (Person p : people) {
	            if (p.hasPet())
	                System.out.println(p);
	        }
	    }
	 
    public void printPeopleWithoutPets() {
        for (Person p : people) {
            if (!p.hasPet())
                System.out.println(p);
        }
    }
	
	
}
