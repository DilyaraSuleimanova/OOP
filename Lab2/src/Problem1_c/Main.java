package Problem1_c;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		 
        HashSet<KZ> countries = new HashSet<>();
 
        KZ c1 = new KZ("KZ", 20000000, "Astana");
        KZ c2 = new KZ("KZ", 20000000, "Astana");
        KZ c3 = new KZ("KZ", 20000000, "Almaty");
 
        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
 
        for (KZ c : countries) {
            System.out.println(c);
        }
 
    }
}
