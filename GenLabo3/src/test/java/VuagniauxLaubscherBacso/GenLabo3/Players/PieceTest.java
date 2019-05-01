package VuagniauxLaubscherBacso.GenLabo3.Players;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import VuagniauxLaubscherBacso.GenLabo3.Squares.RegularSquare;

class PieceTest {

    @Test
    public void aPieceShouldHaveALocation() {
        Piece piece = new Piece(new RegularSquare("test"));

        try {
            assertEquals("test", piece.getLocation().toString());
        } catch (Exception e) {
        	fail("unespected error");
        }
    }

    @Test
    public void aPieceThatAsNoLocationShouldThrowAnError() {
        final Piece piece = new Piece(null);

        assertThrows(Exception.class, () -> piece.getLocation());
    }
}
