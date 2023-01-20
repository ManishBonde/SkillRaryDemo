//WAP TO PRINT RANDOM NUMBER FROM GIVEN RANGE.
package Basics;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of random numbers to be generated: ");
		int n = sc.nextInt();

		Random random = new Random();
		random.ints(n, 1, 100).forEach(System.out::println);

	}

}
