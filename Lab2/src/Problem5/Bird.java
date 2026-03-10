package Problem5;

public class Bird extends Animal {

	public Bird(String name, int age) {
		super(name, age);
		type = AnimalTypes.BIRD;
	}
	
	public String getSound() {
		return "Chick Chick Chick";
	}
}
