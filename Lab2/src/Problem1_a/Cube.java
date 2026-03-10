package Problem1_a;

public class Cube extends Shape3D {
	private double lenght;
	
	public Cube(double l) {
		this.lenght = l;
	}
	
	@Override
	public double volume() {
		return lenght * lenght * lenght;
	}
	
	@Override
	public double surfaceArea() {
		return  6 * lenght * lenght;
	}

}
