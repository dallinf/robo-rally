package edu.chl.roborally.model.tiles;

import edu.chl.roborally.model.Constants;
import edu.chl.roborally.model.Player;

import java.awt.*;

/**
 * Created by axel on 2015-03-31.
 */
public class WallTile extends GameTile{

    private Constants.Directions d1;
    private Constants.Directions d2;
    private String name = "W";

    public WallTile(Constants.Directions d1){
        this.d1=d1;
    }

    public WallTile(Constants.Directions d1, Constants.Directions d2){
        this.d1 = d1;
        this.d2 = d2;
    }



    public void doAction(Player p){
        // new StopPlayer(p, d);
    }

    public String toString() {
        return name;
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.fillRect(x,y,Constants.TILE_SIZE,Constants.TILE_SIZE);
        g.setColor(Color.RED);
        char[] message = "W".toCharArray();
        g.drawChars(message, 0, message.length, x, y+10);
    }

}
