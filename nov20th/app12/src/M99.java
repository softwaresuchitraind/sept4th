import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
class M99  
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1= cal.getTime();
		System.out.println(d1);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}
/*
while formating date to string
u can specify what is the style
*/
