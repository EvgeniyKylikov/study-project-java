package project.kylikov.taxi.utilits;

import java.util.List;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.tools.AutoParkSorting;
import project.kylikov.taxi.tools.AutoParkView;
import project.kylikov.taxi.tools.AutoRemoval;
import project.kylikov.taxi.tools.CarSelectionBySpeed;
import project.kylikov.taxi.tools.Exit;
import project.kylikov.taxi.tools.PriceCalculation;

public class Menu {

	/**
	 * Menu
	 * 
	 * @param passangerCars
	 * @param autoPark1
	 */
	public static void menu(List<PassangerCar> passangerCars, AutoPark autoPark1) {

		while (true)

		{
			System.out.println(Constants.DOUBLE_LINE);
			System.out.println("1. Показать автомобили автопарка");
			System.out.println("2. Удалить автомобиль из автопарка");
			System.out.println("3. Отсортировать автопарк по расходу");
			System.out.println("4. Вывести список автомобилей с заданным диапазоном скорости");
			System.out.println("5. Подсчитать стоимость автопарка");
			System.out.println("0. Выход");
			System.out.println(Constants.DOUBLE_LINE);
			System.out.print("Введите команду: ");

			switch (KeyboardUtilits.inputNumber()) {
			case 1:
				// Displays the current list of cars autopark on the console
				AutoParkView.showAutoParkCars(passangerCars, autoPark1);
				break;

			case 2:
				// Removing cars from the autopark
				AutoRemoval.removeAuto(passangerCars, autoPark1);
				break;

			case 3:
				// Sorts autopark on fuel consumption
				AutoParkSorting.sortAutoPark(passangerCars, autoPark1);
				break;

			case 4:
				// Displays the list of cars with a specified speed range
				CarSelectionBySpeed.takeBySpeed(passangerCars);
				break;

			case 5:
				// Counting the cost of the autopark
				PriceCalculation.calcPrice(passangerCars);
				break;

			case 0:
				// Exit
				Exit.exit(autoPark1);

			default:
				// Otherwise
				System.out.println(Constants.LINE);
				System.out.println(Constants.INVALID_INPUT);
			}
		}
	}
}
