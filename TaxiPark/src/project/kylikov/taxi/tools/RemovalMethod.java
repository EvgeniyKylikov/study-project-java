package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;
import project.kylikov.taxi.utilits.KeyboardUtilits;

public class RemovalMethod {

	/**
	 * Method of removing cars from the autopark
	 * 
	 * @param passangerCars
	 * @param autoPark1
	 * @return
	 */
	static int carRemoval(List<PassangerCar> passangerCars, AutoPark autoPark1) {
		int number;
		int count = passangerCars.size();
		// Printed if the park is empty
		while (count != 0) {
			if (passangerCars.size() == 0) {
				System.out.println(Constants.LINE);
				System.out.println(Constants.EMPTY_AUTOPARK);
				break;
			}

			// Printed if the park is not empty
			System.out.println("Автопарк \"" + autoPark1.getLokation() + "\".");
			System.out.println(Constants.LINE);

			for (int i = 0; i < passangerCars.size(); i++) {
				if (i < Constants.MISSING_DIGIT) {
					System.out.print("0");
				}
				System.out.print(i + 1 + ". ");
				System.out.print(" " + passangerCars.get(i).getModel());
				System.out.println(" [" + passangerCars.get(i).getTypeAuto() + "]. ");
			}

			System.out.println(Constants.LINE);
			// Method for outputting the number of cars in the autopark
			CarCount.numberOfCars(passangerCars);
			System.out.print("Какой автомобиль убрать?" + Constants.IF_ZERO);
			// Choise of numbers of the car to remove
			number = KeyboardUtilits.inputNumber();
			if (number == 0) {
				break;
			}

			if (number < 1 || number - 1 >= passangerCars.size()) {
				System.out.println(Constants.INVALID_INPUT);
				continue;
			}

			//Rremoving cars from the autopark
			System.out.println("Автомобиль " + number + " удален из автопарка.");
			System.out.println(Constants.LINE);
			passangerCars.remove(number - 1);

		}
		return count;
	}
}
