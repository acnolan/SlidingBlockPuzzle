package blockPuzzle.controller;

import javax.swing.JOptionPane;

import blockPuzzle.boundary.BlockPuzzleApp;

public class ExitController {
	public boolean confirmExit(BlockPuzzleApp app) {
		return JOptionPane.showConfirmDialog (app, "Do you really want to close this game?") == JOptionPane.YES_OPTION;
	}
}
