class X
{
	int i;
	static void test(X obj1,X obj2)
	{
		int p=obj1.i;
		obj1.i=obj2.i;
		obj2.i=p;
	}
	public static void main(String[] args) 
	{
		X x1= new X(), x2=new X();//multiple objects can be create by comma operator
		x1.i=10;
		x2.i=20;
		System.out.println("main1"+x1.i+","+x2.i);
		test(x1,x2);
		System.out.println("main2"+x1.i+","+x2.i);
	}
}
