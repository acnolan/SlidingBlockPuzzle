package blockPuzzle.entity;

import blockPuzzle.entity.BlockPuzzle;
import blockPuzzle.entity.Model;
import junit.framework.TestCase;

public class TestModel extends TestCase{
	public void test() {
		Model m=new Model();
		assertEquals(m.getBlockPuzzle().getMoves(),0);
	}
}
