package project.kylikov.taxi.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import project.kylikov.taxi.beans.AutoPark;
import project.kylikov.taxi.utilits.Constants;

public class FileOperation {

	/**
	 * Loads a previously saved file autopark
	 * 
	 * @param autoPark1
	 * @return loaded autopark or empty autopark in case of an error
	 */
	public static AutoPark sessionLoad(AutoPark autoPark1) {
		try {
			FileInputStream is = new FileInputStream("Files/Autopark.bin");
			ObjectInputStream ois = new ObjectInputStream(is);
			autoPark1 = (AutoPark) ois.readObject();
			ois.close();
			System.out.println(Constants.DOUBLE_LINE);
			System.out.println("Предыдущая сессия успешно импротирована.");
		} catch (FileNotFoundException e) {
			System.out.println(Constants.DOUBLE_LINE);
			System.out.println("Предыдущая сессия не найдена.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return autoPark1;
	}

	/**
	 * Saves current session in the file
	 * 
	 * @param autoPark1
	 */
	public static void sessionSave(AutoPark autoPark1) {
		try {
			FileOutputStream os = new FileOutputStream("Files/Autopark.bin");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(autoPark1);
			oos.close();
			System.out.println("Сессия успешно сохранена.");
		} catch (FileNotFoundException e) {
			System.out.println("Не удалось сохранить сессию.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
