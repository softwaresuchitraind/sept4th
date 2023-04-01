class A < Test >
{
	A(Test obj)
	{
	
	}
}
class M15 
{
	public static void main(String[] args) 
	{
		A<String> a1 = new A<String>("abc");
		A<Integer> a2 = new A<Integer>(90);
		A<Double> a3 = new A<Double>(4.5);
		System.out.println("done");
	}
}

/*
-Whereever required we can assign
*/
