package String;

public class RevString2 {
	
	public static void main(String[] args) {
		String str1="Amaravati";
		String rev = "";
		char[]a=str1.toCharArray();
		int len=str1.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse order of given String is: "+rev);
	}

}
