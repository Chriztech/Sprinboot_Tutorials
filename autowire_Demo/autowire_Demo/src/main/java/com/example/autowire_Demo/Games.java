package com.example.autowire_Demo;

import org.springframework.stereotype.Component;

@Component("extraactivity")
public class Games {
	int gameNumber;
	int gameName;
	public int getGameNumber() {
		return gameNumber;
	}
	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
	public int getGameName() {
		return gameName;
	}
	public void setGameName(int gameName) {
		this.gameName = gameName;
	}
	@Override
	public String toString() {
		return "Games [gameNumber=" + gameNumber + ", gameName=" + gameName + "]";
	}
	public void played() {
		System.out.println("played");
	}

}
