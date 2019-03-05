package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;
import project.kylikov.taxi.utilits.KeyboardUtilits;

public class CarSelectionBySpeed {

	/**
	 * Displays the list of cars with a specified speed range
	 * 
	 * @param passangerCars
	 */
	public static void takeBySpeed(List<PassangerCar> passangerCars) {

		int count = passangerCars.size();
		// Printed if the park is empty
		while (count == 0) {
			if (passangerCars.size() == 0) {
				System.out.println(Constants.LINE);
				System.out.println(Constants.EMPTY_AUTOPARK);
				break;
			}
		}

		int valueBegin = -1;
		int valueEnd = -1;

		if (passangerCars.size() > 0) {
			System.out.println(Constants.LINE);
			System.out.println("Подбор автомобилей, соответствующих заданному скоростному диапазону");
			// Input speed range
			while (valueEnd - valueBegin <= 0) {
				while (valueBegin == -1) {

					valueBegin = KeyboardUtilits.inputRange("Введите начало дипазона в формате kmh: ");
				}
				while (valueEnd == -1) {
					valueEnd = KeyboardUtilits.inputRange("Введите конец дипазона в формате kmh: ");
				}
				if (valueEnd - valueBegin < 0) {
					System.out.println("Конец диапазона должен быть больше начала!");
				}
				if (valueBegin != -1 && valueEnd != -1) {
					break;
				}
			}
		}

		MethodOfSelection.carSelection(passangerCars, valueBegin, valueEnd);
	}
}
