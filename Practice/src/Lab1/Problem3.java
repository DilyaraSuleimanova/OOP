package Lab1;

class Temperature {
	private double value;
	private char toScale;
	
	public Temperature() {
		this.value = 0;
		this.toScale = 'C';
	}
	
	public Temperature(char scale) {
		this.value = 0;
		this.toScale = scale;
	}
	
	public Temperature(double value) {
		this.value = value;
		this.toScale = 'C';
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.toScale = scale;
	}
	
	public double toCelsius() {
		
		if(this.toScale == 'C') {
			return 5 * (this.value - 32) / 9; 
		}
		return -1;
	}
	
	public double toFahrenheit() {
		
		if(this.toScale == 'F') {
			return 9 * this.value / 5 + 32; 
		}
		return -1;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setScale(char scale) {
		this.toScale = scale;
	}
	
	public void setBoth(double value, char scale) {
		this.value = value;
		this.toScale = scale;
	}
	
	public char getScale() {
		return this.toScale;
	}
}
