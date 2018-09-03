package br.com.kurauchi.desagil.tequilada;

public class Model {
	private Board board;
	private CpuPlayer cpuPlayer;
	private HumanPlayer humanPlayer;

	public Model() {
		board = new Board("board.txt");

		cpuPlayer = new CpuPlayer(board.getNumRows() - 1, board.getNumCols() - 1, board);
		humanPlayer = new HumanPlayer(0, 0);
	}

	public void update() {
		cpuPlayer.move();
	}

	public Board getBoard() {
		return board;
	}

	public Player getCpuPlayer() {
		return cpuPlayer;
	}

	public Player getHumanPlayer() {
		return humanPlayer;
	}

}