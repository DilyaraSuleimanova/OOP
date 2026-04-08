package Examples;

public class Example3 {
    public static void main(String[] args)     {
		int i;
		int[] data = {50, 320, 97, 12, 2000};
	
		int n = data.length;
	
		for (i = 0; i < n; i++) {
	    	System.out.println(data[i]);
        } 
		System.out.println("Done");
//		try {
//		    for (i = 0; i < 10; i++) {
//		    	System.out.println(data[i]);
//	        }
//	    } 
//	    catch (ArrayIndexOutOfBoundsException aioobe) {
//	    	System.out.println("Done");
//	    }
    }
}
