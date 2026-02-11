package Lab1;

import java.util.Vector;
//import java.util.Scanner;

enum Gender {
	BOY,
	GIRL
}

class Person {
	private String name;
	private Gender gender;
	
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String toString() {
		return name + " - " + gender;
	}
}

class DragonLaunch {
	private Vector<Person> people;
	
	public DragonLaunch() {
		people = new Vector<>();
	}
	
	public void kidnap(Person p) {
		people.add(p);
	}
	
	public void willDragonEatOrNot() {
		for (int i = 0, j = 1; j < people.size(); i++, j++) {
			if(people.get(i).getGender() == Gender.BOY || people.get(j).getGender() == Gender.GIRL) {
				people.remove(i);
				people.remove(j - 1);
				i--;
				j--;
			}
        }
		
		if (people.isEmpty()) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes, " +  people.size() + " student left");
		}
	}
}


public class Problem5 {
	public static void main(String[] args) {
		
		DragonLaunch launch = new DragonLaunch();
		
		launch.kidnap(new Person("C", Gender.GIRL));
		launch.kidnap(new Person("A", Gender.BOY));
		launch.kidnap(new Person("B", Gender.BOY));
		launch.kidnap(new Person("D", Gender.GIRL));
		
		launch.willDragonEatOrNot();
	}
}
