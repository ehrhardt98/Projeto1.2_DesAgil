package br.com.kurauchi.desagil.tequilada;

public class Player {
	protected int row;
	protected int col;

	public Player(int row, int col) {
		this.row = row;
		this.col = col;
	}
	// Tabuleiro organizado com o eixo Y positivo para baixo.
	public void move(int rowShift, int colShift) {
		row += rowShift;
		col += colShift;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
}
