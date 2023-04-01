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
		//DateFormat.getDateInstance(DateFormat.FULL,)
		String s4  = df4.format(d1);
		System.out.println(" full : " +s4);
	}
}
/*
DateFormat can be used formating the date according to country language
*/