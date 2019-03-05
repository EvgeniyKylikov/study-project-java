package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;

public class AutoParkView {

	/**
	 * Outputs to the console the list of cars and information about them
	 * 
	 * @param passangerCars
	 * @param autoPark1
	 */
	public static void showAutoParkCars(List<PassangerCar> passangerCars, AutoPark autoPark1) {

		int count = passangerCars.size();

		// Printed if the park is empty
		while (count == 0) {
			if (passangerCars.size() == 0) {
				System.out.println(Constants.LINE);
				System.out.println(Constants.EMPTY_AUTOPARK);
				break;
			}
		}

		// Printed if the park is not empty
		System.out.println("Автопарк \"" + autoPark1.getLokation() + ".");
		System.out.println(Constants.LINE);

		for (int i = 0; i < passangerCars.size(); i++) {
			if (i < Constants.MISSING_DIGIT) {
				System.out.print("0");
			}
			System.out.print(i + 1 + ". ");
			System.out.print(" " + passangerCars.get(i).getModel());
			System.out.println(" [" + passangerCars.get(i).getTypeAuto() + "].");
		}

		System.out.println(Constants.LINE);
		// Method for outputting the number of cars in the autopark
		CarCount.numberOfCars(passangerCars);

		return;
	}
}
