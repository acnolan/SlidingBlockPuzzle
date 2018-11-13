import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = new Model();
		BlockPuzzle b = m.getBlockPuzzle();
		BlockPuzzleApp game = new BlockPuzzleApp(m);
		game.setVisible(true);
	}

}
