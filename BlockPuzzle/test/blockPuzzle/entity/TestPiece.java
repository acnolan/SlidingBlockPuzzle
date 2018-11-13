package blockPuzzle.entity;

import blockPuzzle.entity.Model;
import blockPuzzle.entity.Piece;
import junit.framework.TestCase;

public class TestPiece extends TestCase{
	public void test() {
		Piece p=new Piece(2, 2, 0, 1);
		assertEquals(p.getCol(),1);
		assertEquals(p.getRow(),0);
		assertEquals(p.getHeight(),2);
		assertEquals(p.getWidth(),2);
		assertTrue(p.isKeyPiece());
		assertFalse(p.isSelected());
		p.setCol(3);
		p.setRow(3);
		p.setSelected(true);
		p.setHeight(1);
		p.setKeyPiece(false);
		p.setWidth(1);
		assertEquals(p.getCol(),3);
		assertEquals(p.getRow(),3);
		assertEquals(p.getHeight(),1);
		assertEquals(p.getWidth(),1);
		assertFalse(p.isKeyPiece());
		assertTrue(p.isSelected());
	}
}
