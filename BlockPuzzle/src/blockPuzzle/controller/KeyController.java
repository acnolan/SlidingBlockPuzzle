package blockPuzzle.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.Model;

public class KeyController implements KeyListener{
	Model m;
	BlockPuzzleApp b;
	public KeyController(Model m, BlockPuzzleApp b) {
		this.m=m;
		this.b=b;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		/*if(e.getKeyCode()==KeyEvent.VK_UP || e.getKeyCode()==KeyEvent.VK_W) {
			new MoveController(m, b).move(0);
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN || e.getKeyCode()==KeyEvent.VK_S) {
			new MoveController(m, b).move(2);
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT || e.getKeyCode()==KeyEvent.VK_A) {
			new MoveController(m, b).move(3);
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT || e.getKeyCode()==KeyEvent.VK_D) {
			new MoveController(m, b).move(1);
		}*/
		int vk=e.getKeyCode();
		handleKeyPress(vk);
	}
	
	public void handleKeyPress(int vk) {
		if(vk==KeyEvent.VK_UP || vk==KeyEvent.VK_W) {
			new MoveController(m, b).move(0);
		}
		if(vk==KeyEvent.VK_DOWN || vk==KeyEvent.VK_S) {
			new MoveController(m, b).move(2);
		}
		if(vk==KeyEvent.VK_LEFT || vk==KeyEvent.VK_A) {
			new MoveController(m, b).move(3);
		}
		if(vk==KeyEvent.VK_RIGHT || vk==KeyEvent.VK_D) {
			new MoveController(m, b).move(1);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
