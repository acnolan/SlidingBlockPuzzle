package blockPuzzle.boundary;

import javax.swing.JPanel;
import javax.swing.border.Border;

import blockPuzzle.controller.KeyController;
import blockPuzzle.controller.SelectController;
import blockPuzzle.entity.Model;
import blockPuzzle.entity.Piece;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PuzzleField extends JPanel{
	Model m;
	SelectController sc;
	BlockPuzzleApp b;
	KeyController kc;
	
	public PuzzleField(Model m, BlockPuzzleApp b) {
		this.m=m;
		setBackground(Color.GRAY);
		setLayout(null);
		
		this.b=b;
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		Border bigBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
		
		setBorder(bigBorder);
		
		sc=new SelectController(PuzzleField.this);
		addMouseListener(sc);
		
		kc=new KeyController(m,b);
		addKeyListener(kc);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(100, 0, 100, 500);
		g.drawLine(200, 0, 200, 500);
		g.drawLine(300, 0, 300, 500);
		g.drawLine(0, 100, 400, 100);
		g.drawLine(0, 200, 400, 200);
		g.drawLine(0, 300, 400, 300);
		g.drawLine(0, 400, 400, 400);
		int i=1;
		for(Piece p: m.getBlockPuzzle().getPieces()) {
			g.setColor(Color.CYAN);
			if(p.isKeyPiece()) {
				g.setColor(Color.red);
			}
			if(p.isSelected()) {
				g.setColor(Color.green);
			}
			g.fillRect(100*p.getCol()+10, 100*p.getRow()+10, 100*p.getWidth()-20, 100*p.getHeight()-20);
		}
		g.setColor(Color.yellow);
		g.fillRect(110, 490, 180, 10);
	}

	public Model getM() {
		return m;
	}

	public void setM(Model m) {
		this.m = m;
	}
}
