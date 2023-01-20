package String2;

public class CountNumberOfWords {

	public static void main(String[] args) {

		String s1 = "welcome to cloudtech and cloudtech is good channel to learn programming";
		int count = 1;
		for (int i = 0; i < s1.length() - 1; i++) {
			if ((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a given string is: "+count);

	}

}
