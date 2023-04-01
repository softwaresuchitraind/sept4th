import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
class M98
{
	public static void main(String[] args) 
	{
		Calendar cal  = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		DateFormat df = DateFormat.getInstance();
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}

/*
-DateFormat is a abstract class.
-It is used for formatting date into String


Sun Nov 24 15:53:27 IST 2013
24/11/13 3:53 PM

*/