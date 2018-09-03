package br.com.kurauchi.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//A expressão "implements ActionListener" estabelece
//que objetos dessa classe podem reagir ao relógio.
public class Controller implements ActionListener, KeyListener {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	// Esse método especial, que a expressão "implements ActionListener"
	// obriga a ter, é o método chamado pelo relógio a cada segundo.
	@Override
	public void actionPerformed(ActionEvent event) {
		model.update();
		view.repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		Board board = model.getBoard();
		Player humanPlayer = model.getHumanPlayer();
		int row = humanPlayer.getRow();
		int col = humanPlayer.getCol();

		if(arg0.getKeyCode() == KeyEvent.VK_W) {
			if(row > 0 && !board.isWall(row - 1, col)) {
				humanPlayer.move(-1, 0);
			}
		}
		else if(arg0.getKeyCode() == KeyEvent.VK_S) {
			if(row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
			humanPlayer.move(1, 0);
			}
		}
		else if(arg0.getKeyCode() == KeyEvent.VK_D) {
			if(col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
			humanPlayer.move(0, 1);
			}
		}
		else if(arg0.getKeyCode() == KeyEvent.VK_A) {
			if(col > 0 && !board.isWall(row, col - 1)) {
				humanPlayer.move(0, -1);
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
