import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
class M99
{
	public static void main(String[] args) 
	{
		Calendar cal  = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}


/*

G:\nov20th\strings-app\src>java -cp ../classes M99
Sun Nov 24 15:55:54 IST 2013
24/11/13


*/