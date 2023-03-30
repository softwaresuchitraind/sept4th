class F 
{
	F()
	{
		System.out.println("F()");
	}
	F(int i)
	{
		System.out.println("F(int)");
	}
	{
		System.out.println("F-IIB");
	}
	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println("-------");
		F f2=new F(30);
		System.out.println("-------");
	}
}
/*
For every object creation IIB executed no matter whatever may be the constructor.

*/