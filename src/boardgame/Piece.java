package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	// creating Board constructor 
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean [][] possibleMove();
	
	public boolean possibleMove(Position position) {
		return possibleMove()[position.getRow()][position.getColumn()];
		
	}
	
	public boolean isThereAnyPossibleMove(){
		boolean [][] array = possibleMove();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j]) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	
	
}
