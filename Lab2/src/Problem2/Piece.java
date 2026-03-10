package Problem2;


 public abstract class Piece {
	Position initialPosition;
	
	public Piece(Position a) {
		this.initialPosition = a;
	}
	
	public abstract boolean isLegalMove(Position b);
//	public abstract boolean isThereOtherPiece(Position b);
	public abstract void move(Position b);
	
}
 