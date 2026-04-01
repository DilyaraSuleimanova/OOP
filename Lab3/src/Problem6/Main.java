package Problem6;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Rex", 3);

        dog.feed();
        dog.play();

        Person p1 = new Person("Alice", 19);
        Person p2 = new Person("Bob", 18);

        System.out.println(p1.compareTo(p2));

	}

}
