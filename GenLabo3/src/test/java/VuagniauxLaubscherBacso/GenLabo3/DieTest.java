package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DieTest {

	
	@Test
	void dieShouldHaveAValueBetweenTheLimit() {

		
		Die die = new Die();
		
		assertTrue(testDie(die),"Test if the die is create with a good value");
		
		for(int i = 0; i < 1000; i++) {
			die.roll();
			assertTrue(testDie(die),"Test if the die roll with a good value");
		}
		
		
		
	}
	
	public boolean testDie(Die die) {
		
		return die.getFaceValue() > 0 && die.getFaceValue() <= Die.getNbface();
		
	}

}
