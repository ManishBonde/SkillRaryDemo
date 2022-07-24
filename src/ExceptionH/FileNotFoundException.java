package ExceptionH;

import java.io.FileOutputStream;

public class FileNotFoundException {
	
	public static void main(String[] args) throws java.io.FileNotFoundException{
		System.out.println("Program Begins...");
		try {
			FileOutputStream file = new FileOutputStream("E:\\Exception\\Exception.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program Ends...");
	}

}
