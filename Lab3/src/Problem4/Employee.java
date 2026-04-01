package Problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee(String name, double salary, Date hireDate, String ins) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
        this.insuranceNumber = ins;
	}
	
	public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }
    
    @Override
    public int compareTo(Employee employee) {
    	return Double.compare(this.salary, employee.salary);
    }
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nSalary: " + salary + 
				"\nHire date: " + hireDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
        if (!(o instanceof Employee e)) return false;
        return Double.compare(salary, e.salary) == 0;
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
