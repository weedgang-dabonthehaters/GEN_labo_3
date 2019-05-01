package VuagniauxLaubscherBacso.GenLabo3.Squares;

import VuagniauxLaubscherBacso.GenLabo3.Players.Player;

public class GoSquare extends Square{

	public GoSquare() {
		super("Go");
	}

	@Override
	public void landedOn(Player p) {
		p.addCash(200);
	}

}
