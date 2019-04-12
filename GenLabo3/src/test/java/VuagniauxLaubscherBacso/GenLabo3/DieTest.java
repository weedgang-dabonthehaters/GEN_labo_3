package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DieTest {

	
	@Test
	void dieShouldHaveAValueBetweenTheLimit() {

		
		Die die = new Die();
		
		assertTrue("Test if the die is create with a good value",testDie(die));
		
		for(int i = 0; i < 1000; i++) {
			die.roll();
			assertTrue("Test if the die roll with a good value",testDie(die));
		}
		
		
		
	}
	
	public boolean testDie(Die die) {
		
		return die.getFaceValue() > 0 && die.getFaceValue() <= Die.getNbface();
		
	}

}
