package blockPuzzle.controller;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.Model;
import junit.framework.TestCase;

public class TestExitController extends TestCase{
	
	BlockPuzzleApp b;
	Model m;
	
	public void setUp() {
		m = new Model();
		b = new BlockPuzzleApp(m);
		b.setVisible(true);
	}
	
	public void test() {
		ExitController exit = new ExitController();
		//exit.confirmExit(b);
	}
	
	public void tearDown() {
		b.setVisible(false);
	}
}
