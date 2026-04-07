package Problem1;

public class Circle extends Shape implements Drawable{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.floor(3.14 * radius * radius * 100) / 100;
	}
	
	public String canBeDrawn() {
		return "Circle drawn";
	}
}
