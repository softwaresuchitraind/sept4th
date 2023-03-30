class S
{
	S(int i)
	{
		System.out.println("S(int)");
	}
}
class T extends S
{
	T(int i)
	{
		super(i);
		System.out.println("T(int)");
	}

	public static void main(String[] args) 
	{
		T t1=new T(90);
		System.out.println(" Done");
	}
}
/*
S(int)
T(int)
Done
-Super(i) should be inside a constructor not inside a method.
-super() calling statement always should be 1st statement of the constructor body.
-Super() calling statement should be as a calling statement to one of the 
 available constructor in the super class.
*/