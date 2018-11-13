package blockPuzzle.controller;

import java.util.LinkedList;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.Model;
import blockPuzzle.entity.Piece;
import junit.framework.TestCase;

public class TestSelectController extends TestCase{
	BlockPuzzleApp b;
	Model m;
	
	public void setUp() {
		m = new Model();		
		b=new BlockPuzzleApp(m);
	}
	
	public void test() {
		m.getBlockPuzzle().setMoves(1000);
		Piece piece = new Piece(1,1,1,1);
		LinkedList<Piece> pieces = new LinkedList<Piece>();
		pieces.add(piece);
		m.getBlockPuzzle().setPieces(pieces);
		SelectController select = new SelectController(b.getPanel());
		select.select(150,150);
		assertTrue(m.getBlockPuzzle().getPieces().get(0).isSelected());
	}
}
