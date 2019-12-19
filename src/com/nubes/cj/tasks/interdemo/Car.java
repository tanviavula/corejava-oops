package com.nubes.cj.tasks.interdemo;

public class Car implements Game {

	@Override
	public void start() {
		System.out.println("Car game is started...");
		
	}

	@Override
	public void play() {
		System.out.println("You are playing car game...");
		
	}

	@Override
	public void stop() {
		System.out.println("Car game has stopped...");
		
	}

}
