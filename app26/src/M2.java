interface A
{
	static 
	{
		System.out.println("A.SIB");
	}
}
class  M2
{
	public static void main(String[] args) 
	{
		A.test();
		System.out.println("done");
	}
}

/*
CTE
SIBs are not involved, only static methods are allowed
*/