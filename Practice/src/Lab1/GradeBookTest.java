package Lab1;

import java.util.Scanner;
import Practice2.Student;

public class GradeBookTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Course course = new Course("CS101 Object-oriented Programming and Design", "Introduction to OOP", 3, "None");

        GradeBook gradeBook = new GradeBook(course);
        gradeBook.displayMessage();

        Student[] students = {
                new Student("Student A", 1),
                new Student("Student B", 2),
                new Student("Student C", 3),
                new Student("Student D", 4),
                new Student("Student E", 5),
                new Student("Student F", 6),
                new Student("Student G", 7),
                new Student("Student H", 8),
                new Student("Student I", 9),
                new Student("Student J", 10)
        };

        System.out.println("Please, input grades for students:\n");

        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            int grade = input.nextInt();
            s.setGrade(grade);
            gradeBook.addStudent(s);
        }

        System.out.println();
        gradeBook.displayGradeReport();
        
        input.close();
    }
}
