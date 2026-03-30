package Game;

public class Main {

    public static void main(String[] args) {

        Knight knight = new Knight("Jake", 100, 50);

        Goblin goblin = new Goblin("Goblin", 90, 60);
        WoodenBox box = new WoodenBox("Box");
        Rock rock = new Rock("Rock");
        Chest chest = new Chest("Treasure Chest");

        goblin.describe();
        knight.attack(goblin);
        goblin.attack(knight);

        System.out.println();

        knight.attack(box);

        System.out.println();

        knight.push(box);
        knight.push(rock);
        knight.push(chest);

        System.out.println();

        knight.interact(chest);
        knight.interact(chest);
    }
}
