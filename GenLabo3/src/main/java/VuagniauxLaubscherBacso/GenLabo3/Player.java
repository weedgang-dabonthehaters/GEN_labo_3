package VuagniauxLaubscherBacso.GenLabo3;

public class Player {

	private String name;
	private Die[] dies;
	private Piece piece;
	private Board board;

	
	public Player(String name, Die[] dies, Piece piece, Board board) {
		this.name 		= name;
		this.dies 		= dies;
		this.piece 		= piece;
		this.board 		= board;

	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void takeTurn(){
		
		Square oldLoc, newLoc;
		int fv = 0;
		
		for(Die die: dies) {
			die.roll();
			fv += die.getFaceValue();
		}
		
		try {
			oldLoc = piece.getLocation();
			newLoc = board.getSquare(oldLoc,fv);
			piece.setLocation(newLoc);
			
		} catch (Exception e) {
			oldLoc = board.getFirstSquare();
			newLoc = board.getSquare(oldLoc,fv);
			piece.setLocation(newLoc);
			e.printStackTrace();
		}
		
		
		
	}

}
