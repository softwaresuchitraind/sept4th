import java.util.Date;
import java.util.Calendar;
class M96
{
	public static void main(String[] args) 
	{
		Calendar cal  = Calendar.getInstance();
		//cal.add(Calendar.DATE,3);
		cal.add(MONTH.DATE,3);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}

/*
G:\nov20th\strings-app\src>java -cp ../classes M96
Tue Nov 27 15:49:29 IST 2018
*/