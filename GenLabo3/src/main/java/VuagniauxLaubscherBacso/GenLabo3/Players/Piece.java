package VuagniauxLaubscherBacso.GenLabo3.Players;

import VuagniauxLaubscherBacso.GenLabo3.Squares.Square;

public class Piece {
    Square location;

    public Piece(Square location) {
        this.location = location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getLocation() throws Exception {
        if(location != null) {
            return location;
        } else {
            throw new Exception("No location found!");
        }
    }
}
