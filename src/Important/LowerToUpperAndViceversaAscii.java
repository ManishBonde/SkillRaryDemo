package Important;

public class LowerToUpperAndViceversaAscii {

	public static void covertOppo(StringBuffer str) {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			Character c=str.charAt(i);
			if(Character.isLowerCase(c)) {
				char toUpperCase=(char) (c-32);
				str.setCharAt(i, toUpperCase);
			}else {
				char toLowerCase=(char) (c+32);
				str.setCharAt(i, toLowerCase);
			}
		} 
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("mANISHbONDE");
		covertOppo(str);

	}

}
