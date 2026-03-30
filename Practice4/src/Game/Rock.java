package Game;

public class Rock extends Objects implements Pushable {

    public Rock(String name) {
        super(name);
    }

    public void push() {
        System.out.println(getName() + " slowly moves.");
    }

    public void describe() {
        System.out.println("A heavy rock.");
    }
}
