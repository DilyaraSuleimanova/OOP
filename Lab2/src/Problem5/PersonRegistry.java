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
	
	
	
	public void printAll() {	 
		for (int i = 0; i < people.size(); i++) {
			Person person = people.get(i);
			System.out.println(person.toString() + "\nHas pet: " + person.hasPet());
			
			if (person.hasPet()) {
				Animal pet = people.get(i).getPet();
				System.out.println("\nPet info:\n" + pet.toString());
			}
			
			System.out.println();
		}
	}
}
