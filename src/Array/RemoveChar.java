package Array;

public class RemoveChar {

	public static void main(String[] args) {
		String str="CloudTeCh";
		char ch='C';
		removeChar(str,ch );
		
	}
	public static void removeChar(String str,char C) {
		int len=str.length();
		String finalstr = "";
		for (int i = 0; i < len; i++) {
			if (str.charAt(i)!=C) {
				finalstr=finalstr+str.charAt(i);
			}
		}
		System.out.println(finalstr);
	}

}
