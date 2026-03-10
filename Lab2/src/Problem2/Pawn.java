package Problem2;

public class Pawn extends Piece {
	
	public Pawn(Position a) {
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
	    
	    return dx == 1 && dy == 0;
	}
}