package Practice3;

class Animal {
	private int legs;
	private String name;
	
	public Animal(String name) {
		this.legs = 4;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumberOfLegs() {
		return this.legs;
	}
	
	public void eat() {
		System.out.println("Nom nom nom");
	}
	
	public void eat(String food) {
		System.out.println("Eating " + food);
	}
	
	public void makesound() {
		System.out.println("🔊");
	}
		
}

class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	public void eat() {
		super.eat();
		System.out.println("Chunk chunk chunk");
	}
	
	@Override 
	public void makesound() {
		System.out.println("Woof Woof");
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Dog dog = new Dog("Lessy");
		
		dog.eat();
        dog.eat("meat"); 
        
        dog.makesound();
        
        System.out.println(dog.getName());
        System.out.println(dog.getNumberOfLegs());
	}
}
