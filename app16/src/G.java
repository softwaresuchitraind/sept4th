class G 
{
	void test()
	{
	
	}
	int i=100;
	static
	{
		System.out.println("sib begin");
		test();
		System.out.println("sib End");
		
	}
	
}
//non static method can not be referened in static contex in straight away.