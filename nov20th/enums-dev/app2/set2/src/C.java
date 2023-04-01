import java.util.EnumSet;
enum B
{
	abc, xyz, test;
}
public class C 
{
	public static void main(String[] args) 
	{
		EnumSet<B> set = EnumSet.of(B.abc, B.xyz, B.test);
		//EnumSet is an abstract class
		for(B b1 : set)
		{
			System.out.println(b1);
		}
	}
}

/*
All the constants u can define EnumSet.
-EnumSet is a part of java.util package.
- u can supply few constraints of enum.
*/
