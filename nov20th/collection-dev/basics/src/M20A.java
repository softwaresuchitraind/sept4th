import java.util.Vector;
import java.util.Enumeration;
class M20A
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(90);
		v1.add(910);
		v1.add(190);
		v1.add(20);
		Enumeration e1 = v1.elements();
		v1.add(50);
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
			System.out.println("-----------------");

		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

		System.out.println("-----------------");
		System.out.println(v1);
		
	}
}

/*

90
910
190
20
50
-----------------
-----------------
[90, 910, 190, 20, 50]



-once pointer reaching to the rightmost hasMoreElements() returns false only.
-Only one time we can iterate all the elements through Enumeration.
*/
