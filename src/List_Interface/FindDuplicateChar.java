package List_Interface;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.next();
		HashSet<Character> charSet = new HashSet<>();
		for (char c : s1.toCharArray()) {
			if (charSet.contains(c)) {
				System.out.print(c + " ");
			} else {
                charSet.add(c);
			}
		}

	}

}
