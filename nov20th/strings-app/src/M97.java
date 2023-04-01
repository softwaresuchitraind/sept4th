import java.util.Date;
import java.util.Calendar;
class M97
{
	public static void main(String[] args) 
	{
		Calendar cal  = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}

/*
Sun Nov 24 15:51:47 IST 2013

*/