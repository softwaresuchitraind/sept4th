interface A
{
	void test1();
}

class B
{
	public void test1()
	{
		System.out.println("from test1");
	}
}

class R extends  B implements A
{
	
	public static void main(String[] args) 
	{
		R r1=new R();
		r1.test1();
		System.out.println("done");
	}
}