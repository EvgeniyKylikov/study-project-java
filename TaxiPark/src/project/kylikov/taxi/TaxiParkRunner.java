package project.kylikov.taxi;

import java.util.List;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.exceptions.EmptyParkException;
import project.kylikov.taxi.files.FileOperation;
import project.kylikov.taxi.tools.AutoParkCreation;
import project.kylikov.taxi.utilits.GregarianCalendar;
import project.kylikov.taxi.utilits.Menu;

/**
 * Main method. Entry point.
 * 
 * @author Evgeniy
 * 
 * @throws EmptyParkException
 */
public class TaxiParkRunner {

	public static void main(String[] args) throws EmptyParkException {

		// Calendar with the current date and time
		GregarianCalendar.printCurrentDateAndTime();

		// Creating autopark
		List<PassangerCar> passangerCars = AutoParkCreation.createAutopark();

		AutoPark autoPark1 = new AutoPark(1, "Minsk", 13, passangerCars);

		// Loading the previous session
		autoPark1 = FileOperation.sessionLoad(autoPark1);

		try {
			autoPark1.createPark(passangerCars);
		} catch (EmptyParkException e) {
			e.printStackTrace();
		}

		// Call menu
		Menu.menu(passangerCars, autoPark1);
	}
}