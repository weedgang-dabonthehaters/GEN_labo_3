package VuagniauxLaubscherBacso.GenLabo3;

import java.util.ArrayList;

public class Board {
	private ArrayList<Square> board = new ArrayList<Square>();
	
	public Board(int size) {
		for(int i = 0; i < size; i++) {
			if(i == 0) {
				board.add(new Square("Go"));
			} else {
				board.add(new Square("Square " + i));
			}
		}
	}
	
	public Square getSquare(Square old, int index) {
		if(old != null) {
			int pos = (board.indexOf(old) + index) % board.size();
			return board.get(pos);
		} else {
			return null;
		}
	}
	
	public Square getFirstSquare() {
		return board.get(0);
	}
}
