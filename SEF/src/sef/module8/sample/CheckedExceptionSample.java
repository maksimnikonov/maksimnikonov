package sef.module8.sample;
// Needs to be completed
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

	public static void main(String arg[]){

		String fileName = "SomeFileThatDoesNotExist.txt";

		//The following class is used to open a file for reading
		try {
			FileReader reader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
