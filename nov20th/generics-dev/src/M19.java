class A < X extends R>
{
	X obj;
}
class M19 
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		System.out.println("done");
	}
}

/*
Cte
INterger or String is not subclass to R
*/