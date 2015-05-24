package edu.chl.roborally.model.cards;

import edu.chl.roborally.model.Player;
import edu.chl.roborally.model.gameactions.MovePlayer;
import edu.chl.roborally.utilities.EventTram;

import javax.imageio.ImageIO;

/**
 * Created by fredrikkindstrom on 31/03/15.
 */
public class MoveOneCard extends RegisterCard{

    public MoveOneCard(int points, boolean isHidden) {
        super(points,isHidden, "Move One");
        try {
            super.mainImage = ImageIO.read(this.getClass().getClassLoader().getResource("cards/move1.png"));
            super.pickImage = ImageIO.read(this.getClass().getClassLoader().getResource("cards/move1_pick.png"));
            super.pickImageRollover = ImageIO.read(this.getClass().getClassLoader().getResource("cards/move1_pick_rollover.png"));
        } catch (java.io.IOException | NullPointerException e){
            System.out.println("Move one card images could not be read");
        }
    }

    public void doAction(Player p) {
        new MovePlayer(p);

        EventTram.getInstance().publish(EventTram.Event.PRINT_MESSAGE, "CardPriority " + getPoints() + ": Moving ", null);
        EventTram.getInstance().publish(EventTram.Event.PRINT_MESSAGE, p.getName() , p.getColor());
        EventTram.getInstance().publish(EventTram.Event.PRINT_MESSAGE, " One Tile" + "\n", null);
    }
}
