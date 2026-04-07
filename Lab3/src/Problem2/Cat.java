package Problem2;

public class Cat extends Animal implements Moveable {

	@Override
	public void move() {
		System.out.println("Cat is moving");

	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow");

	}

}
