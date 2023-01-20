package Others;

import java.io.IOException;
import java.util.Scanner;

public class restartCom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of seconds : ");
		int sec =sc.nextInt();
		Runtime run = Runtime.getRuntime();
		try {
			System.out.println("This system will get restarted after : "+sec+"seconds");
			run.exec("shutdown -r -t "+sec);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
