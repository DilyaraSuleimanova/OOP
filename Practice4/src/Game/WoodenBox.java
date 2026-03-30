package Game;

public class WoodenBox extends Objects implements Attackable, Pushable {
	private boolean isBroke = false;
	public WoodenBox(String name) {
        super(name);
    }	
	
	public void takeDamage(int damage) {
        System.out.println(getName() + " broken!");
        isBroke = true;
    }

    
    public void push() {
        if (isBroke) {
        	System.out.println(getName() + " was pushed");
        } else {
        	System.out.println(getName() + " are broken");
        }
    }
    
    public void describe() {
        System.out.println("A wooden box");
    }
}
