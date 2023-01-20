//Problemm statement - Write a Java Program to count the total number of characters in a string, space ( ') and comma (,) should
//not be counted as a character.
//Input ab, cd, xyz
//output 7
package String;

public class CharacterCount {

	public static void main(String[] args) {
		String s1 = "ab, cd, xyz";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ' && s1.charAt(i) != ',') {
				count++;
			}
		}
		System.out.println("Total number of character in a given string is: " + count);

	}

}
