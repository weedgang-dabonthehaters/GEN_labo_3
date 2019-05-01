package VuagniauxLaubscherBacso.GenLabo3.Game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MonopolyGameTest {

	@Test
	void aGameShouldThrowAnErrorIfThereIsNotEnoughPlayers() {
		assertThrows(Exception.class, () -> new MonopolyGame(1));
	}

	@Test
	void aGameShouldThrowAnErrorIfThereIsToManyPlayers() {
		assertThrows(Exception.class, () -> new MonopolyGame(9));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-1, 0, 1, 4, 2, 6, 8, 10})
	void aGameShouldWorkWithAGoodNumberOfPlayers(int value) {
		if(value < 2 || value > 8) {
			assertThrows(Exception.class, () -> new MonopolyGame(value));
		}
	}
}
