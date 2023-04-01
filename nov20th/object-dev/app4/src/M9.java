class A
{

}
class M9
{
	static A obj;
	static void test1(A arg)
	{
		obj = arg;
		//arg =null;
		test2(null);
	}
	static void test2(A arg)
	{
		obj = arg;
	}
	public static void main(String[] args) 
	{
		test1(new A());
	}
}


/*
At which line object is becoming abadoned ?
line-16


when object is removed from memory ?
uncertion


*/