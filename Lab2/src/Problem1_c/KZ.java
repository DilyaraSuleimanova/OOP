package Problem1_c;
import java.util.Objects;

public class KZ extends Country {
 
    private String capital;
 
    public KZ(String name, int population, String capital) {
        super(name, population);
        this.capital = capital;
    }
 
    @Override
    public boolean equals(Object obj) {
 
        if (this == obj) return true;
 
        if (!(obj instanceof KZ)) return false;
 
        if (!super.equals(obj)) return false;
 
        KZ kz = (KZ) obj;
 
        return Objects.equals(capital, kz.capital);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capital);
    }
 
    @Override
    public String toString() {
        return super.toString() + ", capital: " + capital;
    }
}