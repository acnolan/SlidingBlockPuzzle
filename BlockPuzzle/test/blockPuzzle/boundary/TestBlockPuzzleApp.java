package blockPuzzle.boundary;

import java.awt.Graphics;

import blockPuzzle.entity.Model;
import junit.framework.TestCase;

public class TestBlockPuzzleApp extends TestCase{
	Model m;
	BlockPuzzleApp game;
	
	public void setUp() {
		m=new Model();
		game = new BlockPuzzleApp(m);
		game.setVisible(true);
	}
	
	public void test() {
		try{
			Thread.sleep(1000);
			game.setLblMoves(10);
			assertEquals(game.getLblMoves().getText(),"Moves: 10");
			Model m2=new Model();
			game.setM(m2);
			assertEquals(game.getM(), m2);
			PuzzleField pf = new PuzzleField(m2, game);
			game.setPanel(pf);
			assertEquals(game.getPanel(), pf);
			pf.setM(m2);
			assertEquals(pf.getM(),m2);
		}catch(Exception e) {
			
		}
	}
	
	protected void tearDown() {
		game.setVisible(false);
	}
	
}
