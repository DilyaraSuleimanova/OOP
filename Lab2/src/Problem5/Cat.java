package Problem5;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
		type = AnimalTypes.CAT;
	}
	
	public String getSound() {
		return "Meow Meow Meow";
	}
}
