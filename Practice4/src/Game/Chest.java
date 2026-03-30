package Game;

public class Chest extends Objects implements Pushable, Interactable {

    private boolean isOpen = false;

    public Chest(String name) {
        super(name);
    }

    public void push() {
        System.out.println(getName() + " slowly moves.");
    }

    public void interact() {
        if (!isOpen) {
            isOpen = true;
            System.out.println(getName() + " is opened!");
        } else {
            System.out.println(getName() + " is already open.");
        }
    }

    public void describe() {
        System.out.println("A treasure chest.");
    }
}
