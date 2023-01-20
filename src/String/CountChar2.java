package String;

public class CountChar2 {

	public static void main(String[] args) {
		String str="Manish Devanand Bonde";
	   String str1 = str.toLowerCase();
		char ch='a';
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
		  if(str1.charAt(i)==ch)
		{
		      count++;
		}
		}
		System.out.println(count);
	}

}
 	