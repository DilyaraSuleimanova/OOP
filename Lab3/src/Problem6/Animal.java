package Problem6;

public abstract class Animal implements Feedable, Playable {
	private String name;
	private int age;
	AnimalTypes type;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getNameOfPet() {
		return this.name;
	}
	
	public int getAgeOfPet() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Name: " + getNameOfPet() + "\nAge: " + getAgeOfPet();
	}
	
	public abstract String getSound();
}

