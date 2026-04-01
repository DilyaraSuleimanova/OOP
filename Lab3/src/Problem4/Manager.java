package Problem4;

import java.util.Vector;
import java.util.Date;
import java.util.Objects;

public class Manager extends Employee {
	
	private Vector<Employee> team;
    private double bonus;
    
    public Manager(String name, double salary, Date date, String ins, double bonus) {
        super(name, salary, date, ins);
        this.team = new Vector<>();
        this.bonus = bonus;
    }
    
    public void setToTeam(Employee employee) {
    	team.add(employee);
    }
	
    public Vector<Employee> getTeamMembers() {
    	return team;
    }
    
	@Override
	public String toString() {
		return super.toString() + 
				"\nBonus: " + bonus;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
        if (!(o instanceof Manager m)) return false;
        return Double.compare(bonus, m.bonus) == 0;
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        
        cloned.team = new Vector<>();

        for (Employee e : this.team) {
            cloned.team.add((Employee) e.clone());
        }

        return cloned;    }
}
