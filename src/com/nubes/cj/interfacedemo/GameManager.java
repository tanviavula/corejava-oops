package com.nubes.cj.interfacedemo;

interface Game{
	public static final int a = 100;
	void start();
    void stop();
	void play();
	default void showInfo(){
		System.out.println("This game application is developed in class room session");
	}
    public static void versionInfo(){
		System.out.println("Version number: 1");
	}
}

abstract class AbstractGame implements Game{
	public void start(){
		System.out.println(this.getClass().getSimpleName()+" game is started...");
	}
	public void stop(){
		System.out.println(this.getClass().getSimpleName()+" game is stopped...");
	}
}
class Bike extends AbstractGame implements Game {
	public void play(){
		System.out.println("Bike can move only forward direction....");
	}
	
}

class Car  extends AbstractGame implements Game{
	public void play(){
		System.out.println("Car can move only forward/Backward directions....");
	}
	
}

class Bus extends AbstractGame implements Game{

	@Override
	public void play() {
		System.out.println("You are playing bus game.....");
	}
	
}
public class GameManager {
	
	public static void main(String[] args) {
		Game game = new Car();
		game.showInfo();
		game.start();
		game.play();
		game.stop();
		Game.versionInfo();
	}
		
}
