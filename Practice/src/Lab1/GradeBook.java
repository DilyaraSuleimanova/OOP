package Lab1;

// PROBLEM 4

import java.util.ArrayList;
import Practice2.Student;

class Course {
	private String name, description, prerequisites;
	private int credits;
	
	public Course(String name, String description, int credits, String prerequisites) {
		this.name = name;
		this.description = description;
		this.credits = credits;
		this.prerequisites = prerequisites;
	}
	
	 @Override
    public String toString() {
        return name + " (" + credits + " credits)\n" + description + "\nPrerequisites: " + prerequisites;
    }
}

public class GradeBook {
	private Course course;
	private ArrayList<Student> students;
	
	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<>();
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for ");
		System.out.println(course);
	}
	
	 public void addStudent(Student s) {
	        students.add(s);
	    }
	
	public double determineClassAvg() {
		double total = 0;
		for (Student s: students) {
			total += s.getGrade();
		}
		
		return (double) total / students.size();
	}
	
	public Student determineHighestGrade() {
		Student highest = students.get(0);
		for (Student s: students) {
			if(highest.getGrade() < s.getGrade()) {
				highest = s;
			}
		}
		return highest;
	}
	
	public Student determineLowestGrade() {
		Student lowest = students.get(0);
		for (Student s: students) {
			if(lowest.getGrade() > s.getGrade()) {
				lowest = s;
			}
		}
		return lowest;
	}
	
	public void displayGradeReport() {
		double avg = determineClassAvg();
		Student highest = determineHighestGrade();
		Student lowest = determineLowestGrade();
		System.out.printf("Class average is %.2f.%n", avg);
		System.out.printf("Lowest grade is %d (%s, id: %d)%n", lowest.getGrade(), lowest.getName(), lowest.getId());
		System.out.printf("Highest grade is %d (%s, id: %d)%n", highest.getGrade(), highest.getName(), highest.getId());
	}
	
	
	public void outputBarChart() {
		int[] freq = new int[11];

        for (Student s : students) {
        	int grade = (int) s.getGrade() / 10;
            freq[grade]++;
        }

        System.out.println("\nGrades distribution:");
        for (int i = 0; i < freq.length; i++) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
	

}

