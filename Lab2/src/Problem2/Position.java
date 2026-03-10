package Problem2;

public class Position {
	private char verticalPosition;
	private int horisontalPosition;
	
	public Position(char verticalPosition, int horisontalPosition) {
		this.verticalPosition = verticalPosition;
		this.horisontalPosition = horisontalPosition;
	}
	
	public void setVerticalPosition(char verticalPosition) {
		this.verticalPosition = verticalPosition;
	}
	
	public void setHorisontalPosition(int horisontalPosition) {
		this.horisontalPosition = horisontalPosition;
	}
	
	public char getVerticalPosition() {
		return this.verticalPosition;
	}
	
	public int getHorisontalPosition() {
		return this.horisontalPosition;
	}
	
}
