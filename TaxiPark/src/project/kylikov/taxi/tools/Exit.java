package project.kylikov.taxi.tools;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.files.FileOperation;
import project.kylikov.taxi.utilits.Constants;

public class Exit {

	/**
	 * Exit from the program
	 * 
	 * @param autoPark1
	 */
	public static void exit(AutoPark autoPark1) {

		// Saves current session in the file
		FileOperation.sessionSave(autoPark1);

		System.out.println(Constants.LINE);
		System.out.println("Работа завершена...");
		System.exit(0);
	}
}
