package VuagniauxLaubscherBacso.GenLabo3.Squares;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {
	
	@Test
	void squareToStringTest() {
		RegularSquare s = new RegularSquare("test1");
		assertEquals("test1", s.toString());
	}
	
	@Test
	void squareGetNameTest() {
		RegularSquare s = new RegularSquare("test1");
		assertEquals("test1", s.getName());
	}
	
	@Test
	void createRegularSquareTest() {
		RegularSquare s = new RegularSquare("test1");
		assertEquals("test1", s.getName());
	}
	
	@Test
	void createGoSquareTest() {
		GoSquare s = new GoSquare();
		assertEquals("Go", s.getName());
	}
	
	@Test
	void createJailSquareTest() {
		JailSquare s = new JailSquare();
		assertEquals("Jail", s.getName());
	}
	
	@Test
	void createGoToJailSquareTest() {
		GoToJailSquare s = new GoToJailSquare(new JailSquare());
		assertEquals("GoToJail", s.getName());
	}
	
	@Test
	void createIncomeTaxSquareTest() {
		IncomeTaxSquare s = new IncomeTaxSquare();
		assertEquals("IncomeTax", s.getName());
	}

}
