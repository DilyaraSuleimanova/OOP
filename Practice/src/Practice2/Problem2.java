package Practice2;
import java.util.Scanner;

class StarTriangle {
	
    private String strOfTriangle = "";
    private int layers;
    
    public StarTriangle(int numberOfLayers) {
        this.layers = numberOfLayers;
    }
    
    public String toString() {
        for (int i = 1; i <= this.layers; i++){
            for (int j = 1; j <= i; j++) {           	
            	strOfTriangle += "[*]";
            }
            strOfTriangle += "\n";
        }
        return strOfTriangle;
    }
}


public class Problem2 {

	public static void main(String[] args) {
		int layers;
		Scanner scan = new Scanner(System.in);
		layers = scan.nextInt();
		scan.close();
		
		StarTriangle star = new StarTriangle(layers);
		System.out.println(star.toString());
		
	}

}
