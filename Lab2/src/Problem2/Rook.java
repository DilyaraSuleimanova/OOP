package Problem2;

public class Rook extends Piece {
	
	public Rook(Position a) {
		super(a);
	}
	
	public void move(Position b) {
		if (isLegalMove(b)) {
			this.initialPosition = b;
		}
	}

	@Override
	public boolean isLegalMove(Position b) {
		return b.getHorisontalPosition() == initialPosition.getHorisontalPosition() || 
				b.getVerticalPosition() == initialPosition.getVerticalPosition(); 
	}
}
