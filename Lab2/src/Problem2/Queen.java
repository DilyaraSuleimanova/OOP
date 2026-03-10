package Problem2;

public class Queen extends Piece {
		
	public Queen(Position a) {
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

	    return dx == dy || b.getHorisontalPosition() == initialPosition.getHorisontalPosition() || 
	    		b.getVerticalPosition() == initialPosition.getVerticalPosition();
	
	}
}
