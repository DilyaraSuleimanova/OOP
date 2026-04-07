package Problem2;

public class Dog extends Animal implements Swimable {

	@Override
	public void move() {
		System.out.println("Dog is moving");

	}

	@Override
	public void swim() {
		System.out.println("Dog is swimming");

	}

	@Override
	public void makeSound() {
		System.out.println("Bark Bark");

	}

}
