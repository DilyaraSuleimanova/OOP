package Practice2;

public class Student{
    private String name;
    private int yearOfStudy, id = 1;
    private double grade;
    
    public Student (String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }
    
    public String getName() {
        return name;
    }
    
    public double getId() {
        return id;
    }
    
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    
    public double getGrade() {
    	return this.grade;
    }
    
    public void setGrade(double grade) {
    	this.grade = grade;
    }
    
    public void increaseYearOfStudy() {
        this.yearOfStudy++;
    }
    
    @Override
    public String toString() {
        return name + " (id: " + id + "), grade: " + grade;
    }
}

