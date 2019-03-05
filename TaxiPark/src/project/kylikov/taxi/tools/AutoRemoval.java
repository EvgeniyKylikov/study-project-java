package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;

public class AutoRemoval {

	/**
	 * Removing cars from the autopark
	 * 
	 * @param passangerCars
	 * @param autoPark1
	 */
	public static void removeAuto(List<PassangerCar> passangerCars, AutoPark autoPark1) {

		int count = RemovalMethod.carRemoval(passangerCars, autoPark1);

		// Printed if the park is empty
		while (count == 0) {
			if (passangerCars.size() == 0) {
				System.out.println(Constants.EMPTY_AUTOPARK);
				break;
			}
		}

		return;
	}
}
