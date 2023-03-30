class D
{
	int i;
	void test()
	{
		System.out.println("from test"+this.i);//this is d1
		this.i=20;
	}
	public static void main(String[] args) 
	{
		D d1= new D();
		d1.i=10;
		System.out.println("from main1 :"+d1.i);
		d1.test();
		System.out.println("from main2"+d1.i);
	}
}

/*
in throughout test method d1 can be referred as this<non static methods>
this is a refernce variable which is available in non static method
*/