class C 
{
	void test()
	{
	
	}
	public static void main(String[] args) 
	{
		System.out.println(" Main begin");
		test();
	    System.out.println(" Main End");

	}
}

/*
compile time error
non static method can not referenced static context
*/
