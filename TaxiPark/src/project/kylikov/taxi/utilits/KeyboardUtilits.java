package project.kylikov.taxi.utilits;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Class KeyboardUtilits
 * 
 * @author Evgeniy
 */
public class KeyboardUtilits {

	/**
	 * The entry
	 */
	public static Scanner input = new Scanner(System.in);

	/**
	 * Input number
	 * 
	 * @return int
	 */
	public static int inputNumber() {
		int number = -1;
		input = new Scanner(System.in);
		try {
			number = input.nextInt();
			return number;

		} catch (InputMismatchException e) {
			return -1;
		} finally {

		}
	}

	public static int inputRange(String str) {
		System.out.print(str);
		String range = input.next();
		range = range.trim();
		try {
			String[] rangeArray = range.split(":");
			int kmh = Integer.parseInt(rangeArray[0]);

			if (kmh < 0 || kmh > 350) {
				System.out.print("Неверный формат! ");
				return -1;
			}
			return kmh;
		} catch (Exception e) {
			System.out.print("Неверный формат! ");
			return -1;
		}
	}
}
