package blockPuzzle.controller;

import java.util.LinkedList;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.Model;
import blockPuzzle.entity.Piece;
import junit.framework.TestCase;

public class TestMoveController extends TestCase{

	BlockPuzzleApp b;
	Model m;
	
	public void setUp() {
		m = new Model();		
		
	}
	
	public void test() {
		Piece piece=new Piece(1,1,1,1);
		LinkedList<Piece> pieces=new LinkedList<Piece>();
		piece.setSelected(true);
		pieces.add(piece);
		Piece piece2=new Piece(1, 1, 3, 1);
		pieces.add(piece2);
		m.getBlockPuzzle().setPieces(pieces);
		b = new BlockPuzzleApp(m);
		b.setVisible(true);
		MoveController move= new MoveController(m, b);
		move.move(0);
		assertEquals(piece.getRow(),0);
		move.move(1);
		assertEquals(piece.getCol(),2);
		move.move(2);
		assertEquals(piece.getRow(),1);
		move.move(3);
		assertEquals(piece.getCol(),1);
		move.move(2);
		move.move(2);
		assertEquals(piece.getRow(),2);
		
	}
	
	public void tearDown() {
		b.setVisible(false);
	}
}
