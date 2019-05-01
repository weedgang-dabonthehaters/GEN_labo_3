package VuagniauxLaubscherBacso.GenLabo3.Players;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import VuagniauxLaubscherBacso.GenLabo3.Cups.Cup;
import VuagniauxLaubscherBacso.GenLabo3.Game.Board;

class PlayerTest {

	@BeforeEach
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
	void playerSquareEffectTest() {

		try {
			Cup c = new Cup(2);
			Board board = new Board(40);

			Player player = new Player("playerTest", c, board);

			assertEquals("Go", player.getPiece().getLocation().getName());

			player.getPiece().setLocation(board.getSquare(player.getPiece().getLocation(), 10));

			assertEquals("Jail", player.getPiece().getLocation().getName());
			
			player.getPiece().setLocation(board.getSquare(player.getPiece().getLocation(), 10));
			player.getPiece().getLocation().landedOn(player);

			assertEquals("IncomeTax", player.getPiece().getLocation().getName());
			assertEquals(1350, player.getNetWorth());
			
			player.getPiece().setLocation(board.getSquare(player.getPiece().getLocation(), 10));
			assertEquals("GoToJail", player.getPiece().getLocation().getName());
			player.getPiece().getLocation().landedOn(player);
			assertEquals("Jail", player.getPiece().getLocation().getName());
			
			player.getPiece().setLocation(board.getSquare(player.getPiece().getLocation(), 30));
			player.getPiece().getLocation().landedOn(player);

			assertEquals("Go", player.getPiece().getLocation().getName());
			assertEquals(1550, player.getNetWorth());
			
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