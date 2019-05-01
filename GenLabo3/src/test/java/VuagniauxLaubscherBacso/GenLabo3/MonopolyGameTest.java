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

	@Test
	void aGameShouldPlayNormaly(){
		try{
			MonopolyGame game = new MonopolyGame(5);
			game.playGame();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
