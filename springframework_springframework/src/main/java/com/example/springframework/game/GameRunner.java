package com.example.springframework.game;

public class GameRunner {
	
	MarioGame game;
	//superSpeedGame game;
	 
	public GameRunner(MarioGame game) {
		this.game=game;
	}
	
	/*public GameRunner(SuperSpeedGame game) {
		this.game=game;
	}*/

	public void run() {
		
		
		System.out.println("Running game :"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
