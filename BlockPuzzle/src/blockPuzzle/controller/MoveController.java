package blockPuzzle.controller;

import javax.swing.JOptionPane;

import blockPuzzle.boundary.BlockPuzzleApp;
import blockPuzzle.entity.Model;
import blockPuzzle.entity.Piece;

public class MoveController {
	Model m;
	BlockPuzzleApp b;
	
	public MoveController(Model m, BlockPuzzleApp b) {
		this.m=m;
		this.b=b;
	}
	
	public void move(int direction) {
		Piece selectedPiece=null;
		for(Piece p:m.getBlockPuzzle().getPieces()) {
			if(p.isSelected()) {
				selectedPiece=p;
			}
		}
		if(selectedPiece!=null) {
			switch(direction){
				case 0:
					moveUp(selectedPiece);
					break;
				case 1:
					moveRight(selectedPiece);
					break;
				case 3:
					moveLeft(selectedPiece);
					break;
				case 2:
					moveDown(selectedPiece);
					break;
			}
		}
	}
	
	public void moveUp(Piece selectedPiece) {
		int row=selectedPiece.getRow();
		int col=selectedPiece.getCol();
		boolean collides=false;
		for(int k=col;k<=col+selectedPiece.getWidth()-1;k++) {
			for(Piece p:m.getBlockPuzzle().getPieces()) {
				for(int i=p.getCol();i<=p.getCol()+p.getWidth()-1;i++) {
					for(int j=p.getRow();j<=p.getHeight()+p.getRow()-1;j++) {
						if(j==row-1&&i==k) {
							collides=true;
						}
					}
				}
			}
		}
		if(row-1<0) {
			collides=true;
		}
		if(!collides) {
				selectedPiece.setRow(selectedPiece.getRow()-1);
				m.getBlockPuzzle().setMoves(m.getBlockPuzzle().getMoves()+1);
				b.setLblMoves(m.getBlockPuzzle().getMoves());
				
		}
		b.getPanel().repaint();
	}
	
	public void moveDown(Piece selectedPiece) {
		int row=selectedPiece.getRow();
		int col=selectedPiece.getCol();
		if(selectedPiece.isKeyPiece()&&row==3&&col==1) {
			win();
		}
		boolean collides=false;
		for(int k=col;k<=col+selectedPiece.getWidth()-1;k++) {
			for(int h=row;h<=row+selectedPiece.getHeight()-1;h++) {
				for(Piece p:m.getBlockPuzzle().getPieces()) {
					if(p!=selectedPiece) {
						for(int i=p.getCol();i<=p.getCol()+p.getWidth()-1;i++) {
							for(int j=p.getRow();j<=p.getHeight()+p.getRow()-1;j++) {
								if(j==h+1&&i==k) {
									collides=true;
								}
							}
						}
					}
				}
			}
		}
		if(row+selectedPiece.getHeight()>4) {
			collides=true;
		}
		if(!collides) {
			selectedPiece.setRow(selectedPiece.getRow()+1);
			m.getBlockPuzzle().setMoves(m.getBlockPuzzle().getMoves()+1);
			b.setLblMoves(m.getBlockPuzzle().getMoves());
		}
		b.getPanel().repaint();
	}
	
	public void moveLeft(Piece selectedPiece) {
		int row=selectedPiece.getRow();
		int col=selectedPiece.getCol();
		boolean collides=false;
		for(int k=row;k<=row+selectedPiece.getHeight()-1;k++) {
			for(Piece p:m.getBlockPuzzle().getPieces()) {
				for(int i=p.getCol();i<=p.getCol()+p.getWidth()-1;i++) {
					for(int j=p.getRow();j<=p.getHeight()+p.getRow()-1;j++) {
						if(j==k&&i==col-1) {
							collides=true;
						}
					}
				}
			}
		}
		if(col-1<0) {
			collides=true;
		}
		if(!collides) {
			selectedPiece.setCol(selectedPiece.getCol()-1);
			m.getBlockPuzzle().setMoves(m.getBlockPuzzle().getMoves()+1);
			b.setLblMoves(m.getBlockPuzzle().getMoves());
		}
		b.getPanel().repaint();
	}
	
	public void moveRight(Piece selectedPiece) {
		int row=selectedPiece.getRow();
		int col=selectedPiece.getCol();
		boolean collides=false;
		for(int k=col;k<=col+selectedPiece.getWidth()-1;k++) {
			for(int h=row;h<=row+selectedPiece.getHeight()-1;h++) {
				for(Piece p:m.getBlockPuzzle().getPieces()) {
					if(p!=selectedPiece) {
						for(int i=p.getCol();i<=p.getCol()+p.getWidth()-1;i++) {
							for(int j=p.getRow();j<=p.getHeight()+p.getRow()-1;j++) {
								if(j==h&&i==k+1) {
									collides=true;
								}
							}
						}
					}
				}
			}
		}
		if(col+selectedPiece.getWidth()>3) {
			collides=true;
		}
		if(!collides) {
			selectedPiece.setCol(selectedPiece.getCol()+1);
			m.getBlockPuzzle().setMoves(m.getBlockPuzzle().getMoves()+1);
			b.setLblMoves(m.getBlockPuzzle().getMoves());
		}
		b.getPanel().repaint();
	}
	
	public void win() {
		JOptionPane.showMessageDialog (b, "Congratulations you solved the puzzle in " +m.getBlockPuzzle().getMoves()+ " moves!","Congrats",JOptionPane.INFORMATION_MESSAGE);
		new ResetController(m,b).reset();
	}
}
