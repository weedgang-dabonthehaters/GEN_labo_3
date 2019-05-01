package VuagniauxLaubscherBacso.GenLabo3.Squares;

import VuagniauxLaubscherBacso.GenLabo3.Players.Player;

public abstract class Square {
    protected String name;

    public Square(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public abstract void landedOn(Player p);

}
