package blockPuzzle.entity;

import java.util.LinkedList;

import junit.framework.TestCase;

public class TestBlockPuzzle extends TestCase{
	public void test() {
		BlockPuzzle b=new BlockPuzzle();
		b.setMoves(100);
		assertEquals(b.getMoves(),100);
		LinkedList<Piece> pieces = new LinkedList<Piece>();
		pieces.add(new Piece(0,0,1,1));
		b.setPieces(pieces);
		assertEquals(b.getPieces(),pieces);
	}
}
