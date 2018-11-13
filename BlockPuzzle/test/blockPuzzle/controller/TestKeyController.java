package blockPuzzle.controller;

import java.util.LinkedList;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.Model;
import blockPuzzle.entity.Piece;
import junit.framework.TestCase;

public class TestKeyController extends TestCase{
	BlockPuzzleApp b;
	Model m;
	
	public void setUp() {
		m = new Model();		
		b=new BlockPuzzleApp(m);
	}
	
	public void test() {
		KeyController kc = new KeyController(m,b);
		kc.handleKeyPress(38);//up
		kc.handleKeyPress(40);//down
		kc.handleKeyPress(37);//left
		kc.handleKeyPress(39);//right
		
	}
}
