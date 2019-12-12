package com.nubes.cj.abstractdemo;

import java.util.Scanner;

abstract class Game{
	public void start(){
		System.out.println("Game :"+this.getClass().getSimpleName()+" is started");
	}
	abstract void play();
	public void stop(){
		System.out.println("Game :"+this.getClass().getSimpleName()+" is stopped");
	}
}

class Bike extends Game{

	@Override
	void play() {
		System.out.println(this.getClass().getSimpleName()+" can move only forward direction....");
		
	}


	
}
class Car extends Game{

	@Override
	void play() {
		System.out.println(this.getClass().getSimpleName()+" can move both directions....");
	}

	
	

	
}


public class Manager {
	public static void main(String[] args) {
			while(true){
				System.out.println("1.Bike 2.Car 3.Exit");
				Scanner sc=new Scanner(System.in);
				Game game = null;
				int choice = sc.nextInt();
				if(choice == 1){
					game = new Bike();
				}else if(choice == 2){
					game = new Car();
				}else if(choice == 3){
					//
				}
				
				else{
					System.exit(0);
				}
				game.start();
				game.play();
				game.stop();
				
			}
			
			
	}

	
}
