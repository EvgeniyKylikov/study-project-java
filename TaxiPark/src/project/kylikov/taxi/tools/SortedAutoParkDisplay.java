package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;

public class SortedAutoParkDisplay {

	/**
	 * Prints sorted autopark
	 * 
	 * @param passangerCars
	 * @param autoPark1
	 * @param count
	 */
	static void showSortedPark(List<PassangerCar> passangerCars, AutoPark autoPark1, int count) {
		for (int i = 0; i < passangerCars.size(); i++) {
			if (i < Constants.MISSING_DIGIT) {
				System.out.print("0");
			}
			System.out.print(i + 1 + ". ");
			System.out.print(" " + passangerCars.get(i).getModel());
			System.out.print(" [" + passangerCars.get(i).getTypeAuto() + "].");
			System.out.println(" (" + passangerCars.get(i).getFuelConsumption() + " Liters). ");
		}

		// Printed if the park is not empty
		if (passangerCars.size() > 0) {
			System.out.println(Constants.LINE);
			System.out.println("Автопарк \"" + autoPark1.getLokation() + "\" отсортирован по расхожу топлива.");
		}

		// Printed if the park is empty
		while (count == 0) {
			if (passangerCars.size() == 0) {
				System.out.println(Constants.EMPTY_AUTOPARK);
				break;
			}
		}
	}
}
