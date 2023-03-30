interface A
{
	void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("from B.test");
	}
}
class M122 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
from B.test
AIC test()
lamda.test()
done
*/
