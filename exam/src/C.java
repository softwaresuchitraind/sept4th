class C
{
	public  void method1(String arg1)
	{
		arg1="I am Mr A";
	}
	
	public static void main(String[] args) 
	{
		C c1=new C();
		String name="I am Java";
		c1.method1(name);
		System.out.println(name);
	}
}
