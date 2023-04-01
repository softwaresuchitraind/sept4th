class O 
{
	static int test1()
	{
		return z + p;
	}
	static int test2()
	{
		return p;
	}
	static int x;
	static int y =test1();//initializer executes first
	static int z =test2();
	static int p =10;
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
	}
}
/*
0
0
0
10
compiler can not allow read only value directly.

*/