package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void test() {

		try {
			String name;
			Die[] dies = { new Die(), new Die() };
			Board board = new Board(40);
			Piece piece = new Piece(board.getFirstSquare());

			Player player = new Player("playerTest", dies, piece, board);

			assertEquals("Go", piece.getLocation().toString());

			player.takeTurn();

			assertNotEquals("Go", piece.getLocation().toString());
		} catch (Exception e) {
			fail("unespected error");
		}

	}

}
