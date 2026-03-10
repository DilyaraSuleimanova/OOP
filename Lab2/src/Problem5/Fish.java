package Problem5;

public class Fish extends Animal {
	
	public Fish(String name, int age) {
		super(name, age);
		type = AnimalTypes.FISH;
	}
	
	public String getSound() {
		return "Bulk Bulk Bulk";
	}
}
