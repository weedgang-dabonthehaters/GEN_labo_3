package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonopolyGameTest {

	@Test
	void aGameShouldThrowAnErrorIfThereIsNotEnoughPlayers() {
		assertThrows(Exception.class, () -> new MonopolyGame(1));
	}

	@Test
	void aGameShouldThrowAnErrorIfThereIsToManyPlayers() {
		assertThrows(Exception.class, () -> new MonopolyGame(9));
	}

}
