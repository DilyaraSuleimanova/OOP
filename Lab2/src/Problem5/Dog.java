package Problem5;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
		type = AnimalTypes.DOG;
	}
	
	public String getSound() {
		return "Woow Woow Woow";
	}

}
