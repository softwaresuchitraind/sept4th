import java.util.Vector;
import java.util.Enumeration;
class M20
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
		System.out.println(v1);
		
	}
}

/*


90
910
190
20
50
[90, 910, 190, 20, 50]

Threadsafe operation---50 is adding to the vector
Enumeration is having only reading--it is allowing concurrent operation
we can add later also after declaring Enumeration


-Enumeration is also an interface -it is not in the hierarcy of Iterator and ListIterator.

-Enumeration is only for reading purpose.


*/