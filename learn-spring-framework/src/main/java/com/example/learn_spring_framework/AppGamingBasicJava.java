package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner();
		gameRunner.run();

	}

}
