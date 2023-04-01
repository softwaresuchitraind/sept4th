class N 
{
	static int test1()
	{
		return z;
	}
	static int test2()
	{
		return p;
	}
	static int x;
	static int y =test1();
	static int z =test2();
	static int p =10;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
readonly value of initialiser u can not us edirectly.
It can use with class name and interface name.

*/