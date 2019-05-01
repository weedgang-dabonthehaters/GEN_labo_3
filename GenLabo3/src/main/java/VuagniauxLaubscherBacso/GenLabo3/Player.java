package VuagniauxLaubscherBacso.GenLabo3;

public class Player {

    private String name;
    private Cup cup;
    private Piece piece;
    private Board board;
    private int cash;


    public Player(String name, Cup dies, Board board) {
        this.name = name;
        this.cup = dies;
        this.piece = new Piece(board.getFirstSquare());
        this.board = board;
        this.cash = 1500;

    }

    public Piece getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeTurn() {

        Square oldLoc, newLoc;
        int fv = 0;

        cup.roll();
        fv = cup.getTotal();
        
        System.out.println(this.name + " rolled the cup and got " + fv);

        try {
            oldLoc = piece.getLocation();
            newLoc = board.getSquare(oldLoc, fv);

            System.out.println(this.name + " move from " + oldLoc.getName() + " to " + newLoc.getName());

            piece.setLocation(newLoc);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCash(int amount) {
        this.cash += amount;
    }

    public void reduceCash(int amount) {
        this.cash -= amount;
    }

    public int getNetWorth() {
        return cash;
    }

}