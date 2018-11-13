package blockPuzzle.controller;

import javax.swing.JOptionPane;

import blockPuzzle.boundary.BlockPuzzleApp;

public class InstructionsController {
	public void showInstructions(BlockPuzzleApp app) {
		JOptionPane.showMessageDialog (app, "The goal is to get the red colored square to pass through the yellow box.\n"
										  + "Select a piece with the mouse.\n"
										  + "Then move the piece with the GUI arrows, or WASD, or the arrow keys.\n"
										  + "The reset button resets the board and score.\n"
										  + "That 'x' in the corner closes the game.\n"
										  + "And pressing instructions opens this window. (But you knew that)","Instructions",JOptionPane.INFORMATION_MESSAGE);
	}
}
