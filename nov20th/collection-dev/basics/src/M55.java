import java.util.TreeSet;
import java.util.Comparator;
class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
}

class M55
{
	public static void main(String[] args) 
	{
		//Lamda Expression	
		TreeSet set = 
			new TreeSet( (o1,o2) -> ((A)o1).i - ((A)o2).i );
			
		
		set.add(new A(90));
		set.add(new A(9));
		set.add(new A(910));
		set.add(new A(190));
		set.add(new A(920));
		System.out.println(set);
	}
}
/*
[i = 9, i = 90, i = 190, i = 910, i = 920]

-Use Comparator insted of Comparable
-We can develop a separate comparator

*/