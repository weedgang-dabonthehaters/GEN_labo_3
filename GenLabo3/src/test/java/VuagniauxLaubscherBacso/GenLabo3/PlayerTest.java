package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PlayerTest {

	@Test
	void thePlayerNeedToStartInTheGoSquare() {

		try {
			ArrayList<Die> dies = new ArrayList<Die>();
			dies.add(new Die());
			dies.add(new Die());
			Board board = new Board(40);

			Player player = new Player("playerTest", dies, board);

			assertEquals("Go", player.getPiece().getLocation().getName());

			player.takeTurn();

			assertNotEquals("Go", player.getPiece().getLocation().getName());
		} catch (Exception e) {
			fail("unespected error");
		}

	}

}
