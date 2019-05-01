package VuagniauxLaubscherBacso.GenLabo3.Squares;

import VuagniauxLaubscherBacso.GenLabo3.Players.Player;

public class IncomeTaxSquare extends Square{

	public IncomeTaxSquare() {
		super("IncomeTax");
	}

	@Override
	public void landedOn(Player p) {
		int w = p.getNetWorth();
		p.reduceCash(Math.min(200, (int)(w * 0.1)));
	}

}
