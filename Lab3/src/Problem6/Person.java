package Problem6;


public class Person implements Comparable<Person>, Cloneable {
	private String name;
	private int age;
	private Animal pet;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void assignPet(Animal pet) {
	    this.pet = pet;
	}
	
	public void removePet() {
		this.pet = null;
	}
	
	public boolean hasPet() {
		return pet != null;
	}
	
	public Animal getPet() {
		return pet;
	}
	
	public void leavePetWith(Person person) {

	    if (!this.hasPet()) {
	        System.out.println(this.getName() + " has no pet to leave.");
	        return;
	    } else {
	        System.out.println(person.getName() + " already has a pet.");
	    }
	}
	
	public void retrievePetFrom(Person person) {
		
	    this.assignPet(person.pet);
	    person.removePet();

	    System.out.println(this.getName() + " got back " + pet.getNameOfPet());
	}
	
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nAge: " + age;
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name); 
	}
}
