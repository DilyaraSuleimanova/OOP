package Problem5;


public abstract class Person {
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
	
	public int getAge() {
		return age;
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
	
	public boolean isPhDStudentAndDog(Person person) {
		return person instanceof PhDStudent && pet instanceof Dog;
	}
	
	public void leavePetWith(Person person) {

	    if (!this.hasPet()) {
	        System.out.println(this.getName() + " has no pet to leave.");
	        return;
	    }
	    
	    if(isPhDStudentAndDog(person)) {
	    	System.out.println(person.getName() + " can not take care of " + pet.getNameOfPet());
	    } else if (!person.hasPet()) {
	    	person.assignPet(pet);
	        this.removePet();

	        System.out.println(person.getName() + " is taking care of " + pet.getNameOfPet());
	    } else {
	        System.out.println(person.getName() + " already has a pet.");
	    }
	}
	
	public void retrievePetFrom(Person person) {
		
	    this.assignPet(pet);
	    person.removePet();

	    System.out.println(this.getName() + " got back " + pet.getNameOfPet());
	}
	
	public abstract String getOccupation();
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nAge: " + getAge() + "\nOccupation: " + getOccupation();
	}
}
