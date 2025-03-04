package com.canaydogan.springlearn;

import com.canaydogan.springlearn.game.GameRunner;
import com.canaydogan.springlearn.game.MarioGame;
import com.canaydogan.springlearn.game.PacmanGame;
import com.canaydogan.springlearn.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame(); // Object Creation

        var gameRunner = new GameRunner(game); // Object Creation + Wiring of Dependencies
        // game is a dependency of GameRunner above

        gameRunner.run();
    }
}
