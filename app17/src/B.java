class B 
{

	public static void test(B obj)
	{
		System.out.println("test:"+obj);
	}
	public static void main(String[] args) 
	{
		B b1= new B();
		System.out.println("Main :"+b1);
		test(b1);
	
	}
}
/*
Main :B@1db9742
test :B@1db9742
obj and b1 pointing same location
*/
