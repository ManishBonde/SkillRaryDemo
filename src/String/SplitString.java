package String;

public class SplitString {
     public static void main(String[] args) {
    	String s5="welcome-to-java-programming-world";
    	String[] part = s5.split("-");
 		for(int i=0;i<part.length;i++)
 		{
 			System.out.println(part[i]);
 		}
	}
}
