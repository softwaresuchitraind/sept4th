import java.util.Vector;
import java.util.Enumeration;
class M19
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(90);
		v1.add(910);
		v1.add(190);
		v1.add(20);
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		System.out.println(v1);
		
	}
}

/*

By using Enumeration we can read only one time not more than one time

*/