package Problem5;

public class Main {
	 
    public static void main(String[] args) {
 
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
 
        Animal murka = new Cat("Murka", 5);
 
        john.assignPet(murka);
 
        PersonRegistry registry = new PersonRegistry();
 
        registry.addPerson(john);
        registry.addPerson(alice);
 
        john.leavePetWith(alice);
 
 
        john.retrievePetFrom(alice);
 
    }
}