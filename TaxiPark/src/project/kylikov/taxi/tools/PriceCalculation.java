package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;

public class PriceCalculation {

	/**
	 * Counting the cost of the autopark
	 * 
	 * @param passangerCars
	 */
	public static void calcPrice(List<PassangerCar> passangerCars) {

		int autoParkPrice = 0;
		int count = passangerCars.size();

		while (count == 0) {
			if (passangerCars.size() == 0) {
				System.out.println(Constants.EMPTY_AUTOPARK);
				break;
			}
		}

		for (int i = 0; i < passangerCars.size(); i++) {
			autoParkPrice += passangerCars.get(i).getPrice();
		}
		if (passangerCars.size() > 0) {
			// Method for outputting the number of cars in the autopark
			CarCount.numberOfCars(passangerCars);
			System.out.println("Стоимость автопарка: " + autoParkPrice + "$");
		}
	}
}