package VuagniauxLaubscherBacso.GenLabo3;

import javax.swing.*;
import java.util.ArrayList;

public class MonopolyGame {
    private int roundCnt;
    private final int nbRounds = 20;
    private Board board;
    private ArrayList<Player> players;

    public MonopolyGame(int nbPlayers) throws Exception {
        if (nbPlayers >= 2 && nbPlayers <= 8) {
            this.players = new ArrayList<Player>();
            for (int i = 0; i < nbPlayers; ++i) {
                this.players.add(new Player("player " + i));
            }
        } else {
            throw new Exception("There must be at least 2 players and at most 8 players!");
        }

        board = new Board();
    }

    public void playGame() {
        while (this.roundCnt <= this.nbRounds) {
            playRound();
            ++this.roundCnt;
        }
    }

    private void playRound() {
        for (Player player : this.players) {
            player.takeTurn();
        }
    }
}
