import java.util.Date;
class M90 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1);
		long millis = d1.getTime();
		System.out.println(millis);
	}
}
//from base date to today's date in milli second

/*
Sat Nov 24 15:36:33 IST 2018
1543053993178

*/