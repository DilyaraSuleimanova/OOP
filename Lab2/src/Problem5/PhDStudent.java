package Problem5;


public class PhDStudent extends Person {
	private String specialization, program;
	
	public PhDStudent(String name, int age, String specialization, String program) {
		super(name, age);
		
		this.specialization = specialization;
		this.program = program;
	}
	
	@Override
	public void assignPet(Animal pet) {
		
		if (pet.type != AnimalTypes.DOG) {
			super.assignPet(pet);
		} else {
			System.out.println(this.getName() + " can not take care of " + pet.getNameOfPet());
		}
	}
	
	public String getOccupation() {
		return "PhDStudent: " + "\n\tSpecialization: " + specialization + "\n\tProgram: " + program;
	}
	

}
