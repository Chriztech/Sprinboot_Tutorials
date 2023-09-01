package com.example.springframework;

import com.example.springframework.game.GameRunner;
import com.example.springframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame= new MarioGame();
		// here mariogame cls is tightly coupled with gamerunner cls
		//so if we want to change from one game to another game then code change is needed.
		//var superSpeedGame = new 	SuperSpeedGame();
		
		var gameRunner= new GameRunner(marioGame);
		//var gameRunner= new GameRunner(superSpeedGame);
		
		gameRunner.run();
	}

}
