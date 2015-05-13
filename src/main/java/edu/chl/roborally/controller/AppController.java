package edu.chl.roborally.controller;

import edu.chl.roborally.view.GUI;

public class AppController {

    /**
     * @var ui
     *  The ui variable holds the chosen user interface
     */
    private final GUI gui;
    private GameController gameController;
    private boolean appRunning;

	public AppController() {

        this.appRunning = true;
        gui = new GUI(this);

	}

    public boolean isAppRunning() {
        return appRunning;
    }

    public void initGameController() {
        if (gameController == null) {
            gameController = new GameController();
        } else {
            System.out.println("Game already running");
        }
    }
    public void endGame() {
        this.appRunning = false;
    }

}