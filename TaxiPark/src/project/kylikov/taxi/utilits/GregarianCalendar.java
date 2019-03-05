package project.kylikov.taxi.utilits;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregarianCalendar {

	/**
	 * It prints the current date and time in the console
	 */
	public static void printCurrentDateAndTime() {
		Calendar calendar = new GregorianCalendar();
		System.out.print("Добро пожаловать на сайт нашего автопарка. Сегодня " 
		+ calendar.get(Calendar.DATE) + "."
		+ (calendar.get(Calendar.MONTH) + 1) + "." 
		+ calendar.get(Calendar.YEAR) + ", местное время "
		+ calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
		System.out.println("");
	}
}
