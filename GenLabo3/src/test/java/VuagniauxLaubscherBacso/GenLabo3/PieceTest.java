package VuagniauxLaubscherBacso.GenLabo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PieceTest {

    @Test
    public void aPieceShouldHaveALocation() {
        Piece piece = new Piece(new Square("test"));

        try {
            assertEquals("test", piece.getLocation().toString());
        } catch (Exception e) { }

        piece = new Piece(null);

        try {
        } catch (Exception e) {
            assertEquals("No location found!", e.toString());
        }
    }

}
