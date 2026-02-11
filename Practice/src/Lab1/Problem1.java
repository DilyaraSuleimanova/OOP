package Lab1;
import java.util.Scanner;

class Data {
	private int dataValue, totalValue = 0, counts = 0;
	private double avgValue, maxValue = -10000;
	
	public Data() {
		this.avgValue = 0;
	}
	
	
	public void addValue(int value) {
		this.dataValue = value;
		this.totalValue += value;
		this.counts++;
	}
	
	public void avgCalc() {
		this.avgValue = (double) this.totalValue / this.counts;
	}
	
	public void maxIdentify() {
		if(this.maxValue < this.dataValue) {
			this.maxValue = this.dataValue;
		}
	}
	
	public void showData() {
		System.out.printf("Average = %.2f%n", this.avgValue);
		System.out.printf("Maximum = %.2f%n", this.maxValue);

	}
	
}


class Analyzer {

		
		private Data dataSet = new Data();
		private Scanner scan = new Scanner(System.in);
		
		public void analyzeData() {
			
			while(true) {
				System.out.print("Enter number (Q to quit): ");
				String value = scan.next();
				
				if(value.equalsIgnoreCase("Q")) {
					break;
				}
				
				int number = Integer.parseInt(value);
				
				dataSet.addValue(number);
				dataSet.maxIdentify();
				
			}
			
			dataSet.avgCalc();
			dataSet.showData();
			
			scan.close();
		}
}


