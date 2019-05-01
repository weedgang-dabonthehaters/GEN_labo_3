package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PlayerTest {

	@Test
	void thePlayerNeedToStartInTheGoSquare() {

		try {
			Cup c = new Cup(2);
			Board board = new Board(40);

			Player player = new Player("playerTest", c, board);

			assertEquals("Go", player.getPiece().getLocation().getName());

			player.takeTurn();

			assertNotEquals("Go", player.getPiece().getLocation().getName());
		} catch (Exception e) {
			fail("unespected error");
		}

	}
	
	@Test
	void cashTest() {
		try {
			Cup c = new Cup(2);
			Board board = new Board(40);

			Player player = new Player("playerTest", c, board);

			assertEquals(1500, player.getNetWorth());
			
			player.addCash(2000);
			
			assertEquals(3500, player.getNetWorth());
			
			player.reduceCash(2000);
			
			assertEquals(1500, player.getNetWorth());

		} catch (Exception e) {
			fail("unespected error");
		}
	}

}
