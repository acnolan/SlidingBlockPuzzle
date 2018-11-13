package blockPuzzle.controller;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.Model;
import junit.framework.TestCase;

public class TestResetController extends TestCase{
	BlockPuzzleApp b;
	Model m;
	
	public void setUp() {
		m = new Model();		
		b=new BlockPuzzleApp(m);
	}
	
	public void test() {
		m.getBlockPuzzle().setMoves(1000);
		ResetController reset = new ResetController(m, b);
		reset.reset();
		assertEquals(m.getBlockPuzzle().getMoves(),0);
	}
	
}
