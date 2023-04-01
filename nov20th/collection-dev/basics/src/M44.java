import java.util.LinkedHashSet;
class M44
{
	public static void main(String[] args) 
	{
		LinkedHashSet set = new LinkedHashSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		System.out.println(set);
	
	}
}

/*
[90, 0, 10, 900, 190]
-In order to preserve order of addition LinkedHashSet uses LinkedList Structure.
-same order in whichever order u are adding.

*/