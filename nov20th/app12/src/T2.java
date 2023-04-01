import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;
class T2 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//dd/MMM/yyyy
		//"E-"
		String s1  = sdf.format(d1);
		System.out.println(s1);
	}
}
/*
DateFormat can be used formating the date according to country language
*/