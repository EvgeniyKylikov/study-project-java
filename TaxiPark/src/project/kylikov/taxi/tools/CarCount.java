package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.PassangerCar;

public class CarCount {

	/**
	 * Changes ending depending on the number of cars in the autopark
	 * 
	 * @param passangerCars
	 */
	static void numberOfCars(List<PassangerCar> passangerCars) {
		int x = passangerCars.size();
		int y = x % 100;

		if (x == 11) {
			System.out.println("Всего в автопарке: " + x + " автомобилей");
			return;
		}

		switch (y) {
		case 1:
			System.out.println("Всего в автопарке: " + x + " автомобиль");
			break;
		default:
			switch (y) {
			case 2:
			case 3:
			case 4:
				System.out.println("Всего в автопарке: " + x + " автомобиля");
				break;
			default:
				System.out.println("Всего в автопарке: " + x + " автомобилей");
				return;
			}
		}
	}
}
