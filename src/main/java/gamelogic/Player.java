package gamelogic;
import data.PlayerColor;
import lowlevel.*;

import static data.PlayerColor.WHITE;

public class Player {

    private String name;
    public int score;
    private PlayerColor colour;

    Player(PlayerColor colour, String name) {
        this.colour = colour;
        this.name = name;
        log("Player made: " + name + " ::  " + colour);
    }
    
    public PlayerColor getColour()
    {
        return colour;
    }

    public String getName() {
        return name;
    }

    private void log(String s)
    {
        Utils.log("Player{}:" + s);
    }

    int homeSpikeStart() {
        return colour == WHITE ? 0 : 18;
    }

    int homeSpikeEnd() {
        return colour == WHITE ? 5 : 23;
    }

    int containerId() {
        return colour == WHITE ? -1 : 24;
    }

    int getDestinationSpike(Spike source, int roll) {
        return colour == WHITE ? source.getSpikeNumber() - roll :
            source.getSpikeNumber() + roll;
    }
}
