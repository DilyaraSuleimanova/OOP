package Problem5;

public class Main {
	public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Mars", 45),
                new Chocolate("Snickers", 60)
        };

        Sort.bubbleSort(chocolates);

        for (Chocolate c : chocolates) {
            System.out.println(c);
        }
        
        Time[] times = {
                new Time(10, 30, 24),
                new Time(8, 45, 15),
                new Time(12, 15, 43)
        };

        Sort.bubbleSort(times);

        for (Time t : times) {
            System.out.println(t);
        }
    }
}
