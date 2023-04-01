import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
class M100
{
	public static void main(String[] args) 
	{
		Calendar cal  = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df1.format(d1);
		System.out.println("Short : " +s1);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String s2 = df2.format(d1);
		System.out.println("medium : " +s2);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String s3 = df3.format(d1);
		System.out.println("long : " +s3);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		String s4 = df4.format(d1);
		System.out.println("full : " +s4);
	}
}

/*
Sun Nov 24 15:58:43 IST 2013
Short : 24/11/13
medium : 24 Nov, 2013
long : 24 November, 2013
full : Sunday, 24 November, 2013
*/