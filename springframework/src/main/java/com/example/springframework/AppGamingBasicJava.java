package com.example.springframework;

import com.example.springframework.game.GameRunner;
import com.example.springframework.game.MarioGame;
import com.example.springframework.game.SuperContraGame;

public class AppGamingBasicJava {
public static void main(String[] args) {
		
		var marioGame= new MarioGame();
		
		var game=new SuperContraGame();
		var gameRunner= new GameRunner(marioGame);
		var runner= new GameRunner(game);
		runner.run();
		gameRunner.run();
	}

}
