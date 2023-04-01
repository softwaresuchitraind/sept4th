import java.util.Date;
class M92
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime() + 1000*60*60*24);
		Date d3 = new Date(d1.getTime() - 1000*60*60*24);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}

/*
Sat Nov 24 15:41:25 IST 2018
Sun Nov 25 15:41:25 IST 2018
Fri Nov 23 15:41:25 IST 2018

*/