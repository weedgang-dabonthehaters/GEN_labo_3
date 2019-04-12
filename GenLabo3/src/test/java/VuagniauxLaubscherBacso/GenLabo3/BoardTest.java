package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void boardGetFirstTest() {
		Board b = new Board(40);
		assertEquals(b.getFirstSquare().getName(), "Go");
	}
	
	@Test
	void boardGetSquareTest() {
		Board b = new Board(40);
		Square s = b.getSquare(b.getFirstSquare(), 2);
		assertEquals(s.getName(), "Square 2");
		s = b.getSquare(s, 12);
		assertEquals(s.getName(), "Square 14");
	}

}
