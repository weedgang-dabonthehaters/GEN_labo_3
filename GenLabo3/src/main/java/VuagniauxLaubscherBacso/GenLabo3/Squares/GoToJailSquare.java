package VuagniauxLaubscherBacso.GenLabo3.Squares;

import VuagniauxLaubscherBacso.GenLabo3.Players.Player;

public class GoToJailSquare extends Square{

	private JailSquare jail;
	
	public GoToJailSquare(JailSquare jail) {
		super("GoToJail");
		this.jail = jail;
	}

	@Override
	public void landedOn(Player p) {
		p.getPiece().setLocation(jail);
	}

}
