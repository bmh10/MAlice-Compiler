public class Board {
	
	private enum State {WHITE, BLACK, EMPTY};
	
	private State[][] board;
	
	public Board() {
		this.board = new State[8][8];
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				this.board[i][j] = State.EMPTY;
	}
	
	public State[][] getBoard() {
		return this.board;
	}
	
	// returns false if a piece has already been placed in the given coordinates
	public boolean playPiece(int x, int y, State player) {
		assert(player != State.EMPTY);
		if (board[x][y] == State.EMPTY)
			return false;
		this.board[x][y] = player;
		return true;
	}
	
	public boolean[][] getAll(State player) {
		assert(player != State.EMPTY);
		boolean[][] playables = new boolean[8][8];
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (checkPlayable(player))
					playables[i][j] = true;
		return playables;
	}
	
	public boolean checkPlayable(State player) {
		
		return false;
	}
}









