package VuagniauxLaubscherBacso.GenLabo3.Game;

import java.util.ArrayList;

import VuagniauxLaubscherBacso.GenLabo3.Squares.*;

public class Board {
	private ArrayList<Square> board = new ArrayList<Square>();
	
	public Board(int size) {
		for(int i = 0; i < size; i++) {
			if(i == 0) {
				board.add(new GoSquare());
			} else if(i == 10) {
				board.add(new JailSquare());
			} else if(i == 20) {
				board.add(new IncomeTaxSquare());
			} else if(i == 30) {
				board.add(new GoToJailSquare((JailSquare)board.get(10)));
			} else {
				board.add(new RegularSquare("Square " + i));
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
