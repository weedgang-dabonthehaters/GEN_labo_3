package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CupTest {
    @Test
    void cupTest() {
        Cup cup = new Cup(2);
        cup.roll();

        assertTrue(testCup(cup),"Test if the cup roll with a good value");
    }

    public boolean testCup(Cup cup) {
        return cup.getTotal() > 0 && cup.getTotal() <= Die.getNbface()*2;
    }
}