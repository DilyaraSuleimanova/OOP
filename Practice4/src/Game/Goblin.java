package Game;

public class Goblin extends Creature{
	
	public Goblin(String name, int health, int attackPower) {
		super(name, health, attackPower);
	}

	
	public void describe() {
		System.out.println("A goblin with health: " + getHealth() + " and attack power: " + getAttackPower());
	}
	
}
