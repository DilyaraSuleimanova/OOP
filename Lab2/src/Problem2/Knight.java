package Problem2;

public class Knight extends Piece {
	
	public Knight(Position a) {
		super(a);
	}

	public void move(Position b) {
		if (isLegalMove(b)) {
			this.initialPosition = b;
		}
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		int dx = Math.abs(initialPosition.getHorisontalPosition() - b.getHorisontalPosition());
	    int dy = Math.abs(initialPosition.getVerticalPosition() - b.getVerticalPosition());

	    return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
	}
}

