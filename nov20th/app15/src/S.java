interface A
{
	void test1();
}
class S  implements A 
{
	public void test1(int i)
	{
		System.out.println("from test1(int)");
	}
	public static void main(String[] args) 
	{
		S s1 =new S();
		s1.test1(20);
		System.out.println("done");
	}
}
/*
cte
*/
