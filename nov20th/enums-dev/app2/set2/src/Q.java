interface P
{
	void test1();
}
enum Q implements P
{
	;
	public void test1()
	{
		
	}
}

/*
cs
u can specify all the method of enum.
-every abstract method should implement abstract method.
-enums are only for providing some contracts to enum.

*/