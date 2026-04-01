package Problem4;

import java.util.*;

public class Main {
	public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 5000, new Date(), "123");
        Employee e2 = new Employee("Bob", 6000, new Date(), "456");

        Manager m1 = new Manager("Charlie", 7000, new Date(), "789", 1000);
        
        m1.setToTeam(e1);
        m1.setToTeam(e2);
        System.out.println(m1.getTeamMembers());

        
        System.out.println(e1.compareTo(e2)); 

        
        List<Employee> list = new ArrayList<>();
        list.add(e2);
        list.add(e1);

        list.sort(new SortByName());

        for (Employee e : list) {
            System.out.println(e);
        }

        
        
        try {
            Employee copy = (Employee) e1.clone();
            System.out.println(copy);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
