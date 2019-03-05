package project.kylikov.taxi.tools;

import java.util.ArrayList;
import java.util.List;

import project.kylikov.taxi.beans.PassangerCar;
import project.kylikov.taxi.enums.TypeAuto;

/**
 * Class creates autopark
 * 
 * @author Evgeniy
 */
public class AutoParkCreation {

	public static List<PassangerCar> createAutopark() {
		PassangerCar passangerCar1 = new PassangerCar(1, "Ford Focus", TypeAuto.ECONOMY, 6.5, 12300, 160);
		PassangerCar passangerCar2 = new PassangerCar(2, "Opel Vectra", TypeAuto.ECONOMY, 7.0, 10200, 170);
		PassangerCar passangerCar3 = new PassangerCar(3, "Reno Laguna", TypeAuto.ECONOMY, 7.7, 8000, 150);
		PassangerCar passangerCar4 = new PassangerCar(4, "Dacia Logan", TypeAuto.ECONOMY, 6.8, 6500, 155);
		PassangerCar passangerCar5 = new PassangerCar(5, "Audi 8", TypeAuto.BUSINESS, 11.1, 17300, 240);
		PassangerCar passangerCar6 = new PassangerCar(6, "BMW 725i", TypeAuto.BUSINESS, 10.0, 16400, 240);
		PassangerCar passangerCar7 = new PassangerCar(7, "Lexus XL", TypeAuto.BUSINESS, 9.8, 19800, 260);
		PassangerCar passangerCar8 = new PassangerCar(8, "Toyota Avensis", TypeAuto.BUSINESS, 11.0, 17000, 240);
		PassangerCar passangerCar9 = new PassangerCar(9, "Hyundai Genesis", TypeAuto.PREMIUM, 9.6, 32000, 260);
		PassangerCar passangerCar10 = new PassangerCar(10, "Porsche Panamera", TypeAuto.PREMIUM, 13.0, 29800, 280);
		PassangerCar passangerCar11 = new PassangerCar(11, "Cadillac Escalate", TypeAuto.PREMIUM, 17.6, 34000, 240);
		PassangerCar passangerCar12 = new PassangerCar(12, "Porsche Cayenne", TypeAuto.PREMIUM, 15.2, 27300, 260);

		List<PassangerCar> passangerCars = new ArrayList<>();
		passangerCars.add(passangerCar1);
		passangerCars.add(passangerCar2);
		passangerCars.add(passangerCar3);
		passangerCars.add(passangerCar4);
		passangerCars.add(passangerCar5);
		passangerCars.add(passangerCar6);
		passangerCars.add(passangerCar7);
		passangerCars.add(passangerCar8);
		passangerCars.add(passangerCar9);
		passangerCars.add(passangerCar10);
		passangerCars.add(passangerCar10);
		passangerCars.add(passangerCar11);
		passangerCars.add(passangerCar12);
		return passangerCars;
	}

}
