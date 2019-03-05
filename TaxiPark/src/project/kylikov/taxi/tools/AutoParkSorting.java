package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;

public class AutoParkSorting {

	/**
	 * Sorts autopark on fuel consumption
	 * 
	 * @param passangerCars
	 * @param autoPark1
	 */
	public static void sortAutoPark(List<PassangerCar> passangerCars, AutoPark autoPark1) {

		int count = passangerCars.size();

		System.out.println("Автопарк \"" + autoPark1.getLokation() + ".");
		System.out.println(Constants.LINE);

		// Sorts autopark
		PassangerCar tempPassangerCar = new PassangerCar();
		for (int i = passangerCars.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (passangerCars.get(j).getFuelConsumption() > passangerCars.get(j + 1).getFuelConsumption()) {
					tempPassangerCar = passangerCars.get(j);
					passangerCars.set(j, passangerCars.get(j + 1));
					passangerCars.set(j + 1, tempPassangerCar);

				}
			}
		}

		// Prints sorted autopark
		SortedAutoParkDisplay.showSortedPark(passangerCars, autoPark1, count);
	}
}
