package VuagniauxLaubscherBacso.GenLabo3;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
	
	private final static int nbFace = 6;
	private int faceValue;
	
	public Die() {
		roll();
	}
	
	
	public void roll() {
		
		faceValue = ThreadLocalRandom.current().nextInt(1, nbFace);
		
	}


	public int getFaceValue() {
		return faceValue;
	}




	public static int getNbface() {
		return nbFace;
	}
	
	
	

}
