package Problem4;

public class Series extends Circuit{
	private Circuit resistor1, resistor2;
	private double  potentialDifference;
	
	public Series(Circuit R1, Circuit R2) {
		resistor1 = R1;
		resistor2 = R2;
	}
	
	public double getResistance() {
		double R1 = resistor1.getResistance();
		double R2 = resistor2.getResistance();
		
		return R1 + R2;
	}
	
	public double getPotentialDiff() {
		return potentialDifference;
	}
	
	public void applyPotentialDiff(double V) {
		potentialDifference = V;
		
		double resistance = getResistance();
		double current = potentialDifference / resistance;
		
		double V1 = current * resistor1.getResistance();
		double V2 = current * resistor2.getResistance();
		
		resistor1.applyPotentialDiff(V1);
		resistor2.applyPotentialDiff(V2);
		
	}
	
	
}
