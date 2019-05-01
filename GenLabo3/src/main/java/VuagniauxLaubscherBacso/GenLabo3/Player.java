package VuagniauxLaubscherBacso.GenLabo3;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Die> dies;
    private Piece piece;
    private Board board;


    public Player(String name, ArrayList<Die> dies, Board board) {
        this.name = name;
        this.dies = dies;
        this.piece = new Piece(board.getFirstSquare());
        this.board = board;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece(){ return this.piece; }

    public void takeTurn() {

        Square oldLoc, newLoc;
        int fv = 0;

        for (Die die : dies) {
            die.roll();
            fv += die.getFaceValue();
        }

        try {
            oldLoc = piece.getLocation();
            newLoc = board.getSquare(oldLoc, fv);
            piece.setLocation(newLoc);

        } catch (Exception e) {
            oldLoc = board.getFirstSquare();
            newLoc = board.getSquare(oldLoc, fv);
            piece.setLocation(newLoc);
            e.printStackTrace();
        }
    }

}
