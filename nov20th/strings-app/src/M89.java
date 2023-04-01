import java.util.Date;
class M89 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date(1000*60*60*24);
		System.out.println(d1);
		long millis = d1.getTime();
		System.out.println(millis);
	}
}

/*

Fri Jan 02 05:30:00 IST 1970
86400000
getTime() method returns total number of milli seconds from base date.
*/