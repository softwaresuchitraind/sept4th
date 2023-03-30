interface A
{
	static void test()
	{
		System.out.println("A.SIB");
	}
}

class  M4 implements A
{
	public static void main(String[] args) 
	{
		M4.test();
		System.out.println("done");
	}
}
/*
CTE
static method are only for limited to the current interface only.
*/