package edu.chl.roborally.view;

import edu.chl.roborally.model.Player;
import edu.chl.roborally.utilities.EventTram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by axel on 2015-05-18.
 */
public class StatusView extends JPanel implements ActionListener {

    private Player player;
    private JButton powerDown;
    private JLabel lifeTokens;
    private JLabel dmgTokens;

    public StatusView (Player player){
        this.player = player;
        setLayout(new BorderLayout());
        setSize(322, 162);

        powerDown = new JButton("PowerDown");
        powerDown.addActionListener(this);

        lifeTokens = new JLabel("LifeTokens " + player.getLifeTokens());
        dmgTokens = new JLabel("DamageTokens " + player.getDamageTokens());

        add(powerDown);
        add(lifeTokens);
        add(dmgTokens);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EventTram.getInstance().publish(EventTram.Event.POWER_DOWN, null);
    }
}
