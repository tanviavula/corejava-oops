package com.nubes.cj.tasks.interdemo;

public class Bicycle implements Game {

	@Override
	public void start() {
		System.out.println("Bicycle game is started...");
		
	}

	@Override
	public void play() {
		System.out.println("You are playing Bicycle game...");
		
	}

	@Override
	public void stop() {
		System.out.println("Bicycle game has stopped...");
	}

}
