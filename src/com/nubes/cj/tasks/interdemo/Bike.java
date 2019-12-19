package com.nubes.cj.tasks.interdemo;

public class Bike implements Game {

	@Override
	public void start() {
		System.out.println("Bike game is started...");
	}

	@Override
	public void play() {
		System.out.println("You are playing bike game...");
	}

	@Override
	public void stop() {
		System.out.println("Bike game is stopped");
	}

}
