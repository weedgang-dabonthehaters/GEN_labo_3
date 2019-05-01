package VuagniauxLaubscherBacso.GenLabo3.Cups;

import java.util.ArrayList;

public class Cup {
	ArrayList<Die> dies = new ArrayList<Die>();
	int totalValue = 0;
	
	public Cup(int nb) {
		for(int i = 0; i < nb; i++) {
			dies.add(new Die());
		}
	}
	
	public void roll() {
		totalValue = 0;
		for(Die d : dies) {
			d.roll();
			totalValue += d.getFaceValue();
		}
	}
	
	public int getTotal() {
		return totalValue;
	}
}
