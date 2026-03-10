package Practice3;

import java.util.Vector;

class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address;
	}
	
}

class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram() {
		return this.program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getFee() {
		return this.fee;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nAddress: " + getAddress() + "\nProgram: " + this.program + "\nYear: " + this.year + "\nFee: " + this.fee;
	}
	
}

class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	public String getSchool() {
		return this.school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return this.pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nAddress: " + getAddress() + "\nSchool: " + this.school + "\nPay: " + this.pay;
	}
}

public class Problem2 {
	public static void main(String[] args) {
		Vector<Student> students = new Vector<>();
		Vector<Staff> staffs = new Vector<>();
		
		students.add(new Student("Maral", "Almaty", "Information Systems", 2, 40000));
		students.add(new Student("Alan", "Astana", "Information Systems", 3, 40000));
		students.add(new Student("Karry", "Almaty", "Computer Systems", 1, 40000));
		
		
		staffs.add(new Staff("Dastan", "Aktau", "ISE", 500000));
		staffs.add(new Staff("Karlygash", "Karaganda", "SITE", 450000));
		staffs.add(new Staff("Sultan", "Shymkent", "BS", 60000));
		
		System.out.println("STUDENTS:");
		for (Student student: students) {
			System.out.println(student.toString() + "\n");
		}
		
		System.out.println("STAFFS:");

		for (Staff staff: staffs) {
			System.out.println(staff.toString() + "\n");
		}
	}
}
