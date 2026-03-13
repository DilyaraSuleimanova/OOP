package Problem1_a;

public class Main {

	public static void main(String[] args) {
		Cube cube = new Cube(4);
		Cylinder cylinder = new Cylinder(5, 4);
		Sphere sphere = new Sphere(3);
		
		System.out.printf("Cube volume: %f", cube.volume());
		System.out.println();
		System.out.printf("Cylinder volume: %f", cylinder.volume());
		System.out.println();
		System.out.printf("Sphere volume: %f", sphere.volume());
	}

}
