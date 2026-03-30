package Game;

public class Knight extends Creature{

    public Knight(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void push(Pushable object) {
        System.out.println(getName() + " pushes object.");
        object.push();
    }

    public void interact(Interactable object) {
        System.out.println(getName() + " interacts.");
        object.interact();
    }
	
	
	public void describe() {
		System.out.println("Knight" + getName() + " with health " + getHealth() + " and attack power: " + getAttackPower());
	}

	
}
