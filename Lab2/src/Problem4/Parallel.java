package Problem4;

public class Parallel extends Circuit{
	private Circuit resistor1, resistor2;
	
	public Parallel(Circuit R1, Circuit R2) {
		resistor1 = R1;
		resistor2 = R2;
	}
	
	public double getResistance() {
		double R1 = resistor1.getResistance();
		double R2 = resistor2.getResistance();
		
		return R1 * R2 / (R1 + R2);
	}
	
	public double getPotentialDiff() {
		return resistor1.getPotentialDiff();
	}
	
	public void applyPotentialDiff(double V) {
		resistor1.applyPotentialDiff(V);		
		resistor2.applyPotentialDiff(V);
	}

}
