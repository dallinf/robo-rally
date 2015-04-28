package edu.chl.roborally.view.gui;

import edu.chl.roborally.controller.AppController;
import edu.chl.roborally.model.Player;
import edu.chl.roborally.view.UI;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by henriknilson on 28/04/15.
 */
public class GUIController extends UI {

    private JFrame main;
    private JPanel startPanel;

    public GUIController(AppController appController) {
        super(appController);

        main = new MainWindow();

        startMsg();
    }

    @Override
    public void startMsg() {
        // Maybe should be in menu
        startPanel = new StartScreen(super.appController);
        main.add(startPanel, BorderLayout.CENTER);
        main.revalidate();
    }

    @Override
    public void menu() {

    }

    @Override
    public ArrayList<String> getPlayerNames() {
        main.remove(startPanel);

        main.add(new SetupPanel());
        main.revalidate();

        ArrayList list = new ArrayList<String>();
        list.add("acke");

        return list;
    }

    @Override
    public int chooseMap(ArrayList<String> maps) {
        return 0;
    }

    @Override
    public void chooseCards(Player p) {

    }
}