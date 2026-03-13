package Problem2;

public class Main {
	public static void main(String[] args) {
		Rook rook = new Rook(new Position('A', 8));
		System.out.print(rook.isLegalMove(new Position('B', 7)));
	}
}
