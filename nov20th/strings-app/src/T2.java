import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;
class T2 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("E-dd-MMMM-yyyy",Locale.ITALY);
		String s1 = sdf.format(d1);
		System.out.println(s1);
	}
}
/*
search SimpleDateFormat from goole
what format we want we can specify


G:\nov20th\strings-app\src>java -cp ../classes T2
Sun Nov 24 16:06:12 IST 2013
24-11-2013


Sun Nov 24 16:09:46 IST 2013
24-Nov-2013

*/