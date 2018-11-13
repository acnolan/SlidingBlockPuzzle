package blockPuzzle.controller;

import java.awt.KeyboardFocusManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import blockPuzzle.boundary.PuzzleField;
import blockPuzzle.entity.Piece;

public class SelectController extends MouseAdapter{

	PuzzleField pf;
	
	public SelectController(PuzzleField pf) {
		this.pf=pf;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		int y=me.getY();
		int x=me.getX();
		select(x,y);
		pf.repaint();
	}
	
	public void select(int x, int y) {
		for(Piece p:pf.getM().getBlockPuzzle().getPieces()) {
			p.setSelected(false);
		}
		for(Piece p:pf.getM().getBlockPuzzle().getPieces()) {
			if(p.getRow()*100 <y &&y< 100*(p.getRow()+p.getHeight())){
				if(p.getCol()*100<x && x<100*(p.getWidth()+p.getCol())){
					p.setSelected(true);
				}
			}
		}
	}
}
