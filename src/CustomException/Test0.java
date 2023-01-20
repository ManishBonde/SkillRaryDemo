package CustomException;

import java.util.Scanner;

public class Test0 {

	public static void main(String[] args) throws MarriageException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age= sc.nextInt();
		if(age>21) {
			System.out.println("Go and Marry");
		}
		else {
			throw new MarriageException("wait");
		}
	}

}
