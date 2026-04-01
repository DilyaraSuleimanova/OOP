package Problem4;

import java.util.Comparator;

class SortByName implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }
}

class SortByHireDate implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.getHireDate().compareTo(b.getHireDate());
    }
}