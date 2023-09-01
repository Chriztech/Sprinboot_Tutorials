package com.example.springframework.game;

public class GameRunner {
	
	private GameConsole game;
	
	 // game runner cls is not coupled to a particular game now 
	public GameRunner( GameConsole game) {
		this.game=game;
	}
	
	

	public void run() {
		
		
		System.out.println("Running game :"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
