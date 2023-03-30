interface A
{
	void test1();
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = () ->
		{
			System.out.println("from test1");
		};
	}
}
