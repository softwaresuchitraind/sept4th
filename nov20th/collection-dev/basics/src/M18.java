import java.util.Vector;
import java.util.Enumeration;
class M18
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
		System.out.println(v1);
		
	}
}


/*
Enumeration is a another interface.
It is a separate interface,not in the hierarchy 
it is containg only two methods for reading purpose.
it is only for reading purpose


*/