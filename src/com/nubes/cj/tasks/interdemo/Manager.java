package com.nubes.cj.tasks.interdemo;

public class Manager {

	public static void main(String[] args) {
		Game[] games = new Game[10];
		for (int i = 0; i < 10; i++) {
			int rnumber = (int) (Math.ceil(Math.random() * 3));
			switch (rnumber) {
			case 1:
				Car car = new Car();
				games[i] = car;
				break;
			case 2:
				Bike bike = new Bike();
				games[i] = bike;
				break;
			case 3:
				Bicycle bicycle = new Bicycle();
				games[i] = bicycle;
				break;
			default:
				throw new IllegalArgumentException("Invalid game name has been provided");
			}
		}

		for (Game game : games) {

			game.start();
			game.play();
			game.stop();
			System.out.println("------------------------------------------");
		}
		displayGameCount(games);

	}

	public static void displayGameCount(Game games[]) {
		int bikeCount, bcycleCount, carCount;
		bikeCount = bcycleCount = carCount = 0;
		for (Game game : games) {
			if (game instanceof Car) {
				carCount++;
			} else if (game instanceof Bike) {
				bcycleCount++;
			} else if (game instanceof Bicycle) {
				bikeCount++;
			}
		}
		System.out.println("Bike Count:"+bikeCount);
		System.out.println("Car Count:"+carCount);
		System.out.println("Bicycle count:"+bcycleCount);
	}

}
