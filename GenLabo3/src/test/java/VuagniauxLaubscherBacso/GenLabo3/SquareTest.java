package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {
	
	@Test
	void squareToStringTest() {
		Square s = new Square("test1");
		assertEquals("test1", s.toString());
	}
	
	@Test
	void squareGetNameTest() {
		Square s = new Square("test1");
		assertEquals("test1", s.getName());
	}

}
