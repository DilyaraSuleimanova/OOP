package Game;

public abstract class Creature implements Attackable{
	private String name;
	private int health;
	private int attackPower;
	
	public Creature(String name, int health, int attackPower) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
	}
	
	public void attack(Attackable target) {
        System.out.println(getName() + " attacks!");
        target.takeDamage(getAttackPower());
    }
	
	public void takeDamage(int damage) {
		health -= damage;
		
		System.out.println(getName() + " took " + damage + " damage!");
		
		if (health <= 0) {
			System.out.println(getName() + " died!");
		}
		
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public String getName() {
		return name;
	}
}
