package String;

public class CountVowels {

	public static void main(String[] args) {
		String s1=new String("welcome india");
		int count=0;
		 for (int i=0 ; i<s1.length(); i++){
	         char ch = s1.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
			
		}
		System.out.println("Number of vowels present in given string is: "+count);
   }

}