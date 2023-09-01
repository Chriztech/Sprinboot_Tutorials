package com.example.springframework.game;

public class SuperContraGame implements GameConsole{
     
	
	
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("go slow");
	}
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("shoot");
	}
}
