package Problem1_c;
import java.util.Objects;

public class Country {
 
    protected String name;
    protected int population;
 
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
 
        if (!(obj instanceof Country)) return false;
 
        Country c = (Country) obj;
 
        return population == c.population &&
                Objects.equals(name, c.name);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }
 
    @Override
    public String toString() {
        return name + " population: " + population;
    }
}