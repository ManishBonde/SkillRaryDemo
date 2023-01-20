/*Write Java Program for converting 08-04-2022 to 08-Apr-2022?*/

package calender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Exercise1 {
    public static void main(String[] args) throws ParseException
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    	String dateInString = "27-04-2016 10:22:56";
    	Date date = sdf.parse(dateInString);

    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);

        System.out.println(calendar.toString());
	 }
}
