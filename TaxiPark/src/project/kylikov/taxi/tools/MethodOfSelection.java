package project.kylikov.taxi.tools;

import java.util.List;

import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.utilits.Constants;

public class MethodOfSelection {

	/**
	 * Method of selecting cars for a given range of speeds
	 * 
	 * @param passangerCars
	 * @param valueBegin
	 * @param valueEnd
	 */
	static void carSelection(List<PassangerCar> passangerCars, int valueBegin, int valueEnd) {
		boolean print = false;
		if (passangerCars.size() > 0) {
			System.out.println(Constants.LINE);
			System.out.println("Автомобили с диапазоном скорости от " + valueBegin + " и до " + valueEnd + " kmh:");
			System.out.println(Constants.LINE);

			for (int i = 0; i < passangerCars.size(); i++) {
				if (passangerCars.get(i).getMaxSpeed() >= valueBegin
						&& passangerCars.get(i).getMaxSpeed() <= valueEnd) {
					print = true;
					if (i < Constants.MISSING_DIGIT) {
						System.out.print("0");
					}
					System.out.print(i + 1 + ". ");
					System.out.print(" " + passangerCars.get(i).getModel());
					System.out.print(" [" + passangerCars.get(i).getTypeAuto() + "].");
					System.out.println(" (" + passangerCars.get(i).getMaxSpeed() + " kmh). ");
				}
			}
			if (print) {

			} else {
				System.out.println("Не найдены. Попробуйте расширить диапазон поиска!");
			}
		}
	}
}
