package blockPuzzle.entity;

import java.util.LinkedList;
import java.util.List;

public class BlockPuzzle {
	LinkedList<Piece> pieces = new LinkedList<Piece>();
	int moves;
	
	public BlockPuzzle() {
		Piece piece1 = new Piece(1,2,0,0);
		Piece piece2 = new Piece(1,2,2,0);
		Piece piece3 = new Piece(1,1,0,1);
		Piece piece4 = new Piece(1,1,0,2);
		Piece piece5 = new Piece(1,1,0,3);
		Piece piece6 = new Piece(1,2,1,1);
		Piece piece7 = new Piece(2,2,1,2);
		Piece piece8 = new Piece(2,1,3,1);
		Piece piece9 = new Piece(1,1,3,3);
		Piece piece10 = new Piece(2,1,4,2);
		pieces.add(piece1);
		pieces.add(piece2);
		pieces.add(piece3);
		pieces.add(piece4);
		pieces.add(piece5);
		pieces.add(piece6);
		pieces.add(piece7);
		pieces.add(piece8);
		pieces.add(piece9);
		pieces.add(piece10);
		
		moves=0;
	}
	
	public void setPieces(LinkedList<Piece> pieces) {
		this.pieces = pieces;
	}

	public LinkedList<Piece> getPieces() {
		return pieces;
	}
	
	public int getMoves() {
		return moves;
	}
	
	public void setMoves(int i) {
		moves=i;
	}
}
