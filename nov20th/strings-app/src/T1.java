import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Locale;
class T1 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		DateFormat df4 =
			DateFormat.getDateInstance(DateFormat.FULL,Locale.ITALY);
		//DateFormat.getDateInstance(DateFormat.FULL,Locale.FRANCE);
		String s4 = df4.format(d1);
		System.out.println("full:" +s4);
	}
}
/*

G:\nov20th\strings-app\src>java -cp ../classes T1
Sun Nov 24 16:01:33 IST 2013
full:domenica 24 novembre 2013

u can specify which country formating the date
countrywise month and day is changing.
u can specify which country date is forming in the form of full.

-For any internationalized project u can specify Locale.
*/