package VuagniauxLaubscherBacso.GenLabo3.Game;

import java.util.ArrayList;

import VuagniauxLaubscherBacso.GenLabo3.Cups.Cup;
import VuagniauxLaubscherBacso.GenLabo3.Players.Player;

public class MonopolyGame {
    private int roundCnt = 1;
    private final int nbRounds = 20;

    private Board board;
    private ArrayList<Player> players;

    private final int nbDie = 2;
    private Cup dies;

    public MonopolyGame(int nbPlayers) throws Exception {
        if (nbPlayers >= 2 && nbPlayers <= 8) {
            this.board = new Board(40);

            dies = new Cup(nbDie);

            this.players = new ArrayList<Player>();
            for (int i = 1; i <= nbPlayers; ++i) {
                this.players.add(new Player("player " + i, this.dies, this.board));
            }
        } else {
            throw new Exception("There must be at least 2 players and at most 8 players!");
        }


    }

    public void playGame() {
        while (this.roundCnt <= this.nbRounds) {
            System.out.println("--------------------");
            System.out.println("Round " + this.roundCnt);
            System.out.println("--------------------");

            playRound();
            ++this.roundCnt;
        }
    }

    private void playRound() {
        for (Player player : this.players) {
            player.takeTurn();
        }
    }
    
    public static void main(String[] args) {
    	try{
			MonopolyGame game = new MonopolyGame(4);
			game.playGame();
		} catch (Exception e){
			e.printStackTrace();
		}
    }
}