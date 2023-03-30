class A
{
	private void test()
	{
	
	}
}
class I extends A 
{
	public static void main(String[] args) 
	{
		I obj=new I();
		obj.test();
		System.out.println("done");
	}
}
/*
CTE
test() of A not available inside I
*/