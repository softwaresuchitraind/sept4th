class E 
{
	int i;
	void test1()
	{
		System.out.println("from test1 "+this.i);
		this.i=10;
		this.test2();
	}
	void test2()
	{
		System.out.println("from test2 "+this.i);
		this.i=20;
	}
	public static void main(String[] args) 
	{
		E e1= new E();
		e1.i=30;
		System.out.println("From main1 " +e1.i);
		e1.test1();//this is e1 inside test1()
		System.out.println("from main2 "+e1.i);
		e1.i=40;
		e1.test2();
		System.out.println("from main3 "+e1.i);
	}
}
/*
in every non static  defination block there is a default refernce variable
the defalut reference variable is "this"
in any static defination block this is not available.
*/