package blockPuzzle.controller;

import java.util.LinkedList;

import javax.swing.JLabel;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.boundary.PuzzleField;
import blockPuzzle.entity.BlockPuzzle;
import blockPuzzle.entity.Model;
import blockPuzzle.entity.Piece;

public class ResetController {
	Model m;
	BlockPuzzleApp b;
	LinkedList<Piece> pieces = new LinkedList<Piece>();
	
	public ResetController(Model m, BlockPuzzleApp b) {
		this.m=m;
		this.b=b;
	}
	
	public boolean reset() {
		Model newModel = new Model();
		BlockPuzzle puzzle = m.getBlockPuzzle();
		PuzzleField view = b.getPanel();
		puzzle.setMoves(0);
		Piece piece1 = new Piece(1,2,0,0);
		Piece piece2 = new Piece(1,2,2,0);
		Piece piece3 = new Piece(1,1,0,1);
		Piece piece4 = new Piece(1,1,0,2);
		Piece piece5 = new Piece(1,1,0,3);
		Piece piece6 = new Piece(1,2,1,1);
		Piece piece7 = new Piece(2,2,1,2);
		Piece piece8 = new Piece(2,1,3,1);
		Piece piece9 = new Piece(1,1,3,3);
		Piece piece10 = new Piece(2,1,4,2);
		pieces.add(piece1);
		pieces.add(piece2);
		pieces.add(piece3);
		pieces.add(piece4);
		pieces.add(piece5);
		pieces.add(piece6);
		pieces.add(piece7);
		pieces.add(piece8);
		pieces.add(piece9);
		pieces.add(piece10);
		puzzle.setPieces(pieces);
		view.repaint();
		b.setLblMoves(m.getBlockPuzzle().getMoves());
		return true;
	}
}
