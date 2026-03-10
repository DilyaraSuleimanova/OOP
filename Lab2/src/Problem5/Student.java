package Problem5;

public class Student extends Person {
	private String specialization, program;
	
	public Student(String name, int age, String specialization, String program) {
		super(name, age);
		
		this.specialization = specialization;
		this.program = program;
	}


	public String getOccupation() {
		return "Student: " + "\n\tSpecialization: " + specialization + "\n\tProgram: " + program;
	}
}
