package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PieceTest {

    @Test
    public void aPieceShouldHaveALocation() {
        Piece piece = new Piece(new Square("test"));

        try {
            assertEquals("test", piece.getLocation().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void aPieceThatAsNoLocationShouldThrowAnError() {
        final Piece piece = new Piece(null);

        assertThrows(Exception.class, () -> piece.getLocation());
    }
}
