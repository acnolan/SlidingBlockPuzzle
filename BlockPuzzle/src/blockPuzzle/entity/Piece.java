package blockPuzzle.entity;

public class Piece {
	int width;
	int height;
	int row;
	int col;
	boolean keyPiece;
	boolean isSelected;
	
	public Piece(int width, int height, int row, int col) {
		this.width=width;
		this.height=height;
		this.row=row;
		this.col=col;
		if(width==2 && height==2) {
			keyPiece=true;
		}else {
			keyPiece=false;
		}
		isSelected=false;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public boolean isKeyPiece() {
		return keyPiece;
	}

	public void setKeyPiece(boolean keyPiece) {
		this.keyPiece = keyPiece;
	}
	
}
