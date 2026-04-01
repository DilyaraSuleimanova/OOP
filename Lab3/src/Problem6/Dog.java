package Problem6;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void feed() {
		System.out.println("Eating");

	}

	@Override
	public void play() {
		System.out.println("Playing");

	}

	@Override
	public String getSound() {
		
		return "Woof";
	}

}
