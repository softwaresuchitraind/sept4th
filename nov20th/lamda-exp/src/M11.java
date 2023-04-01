interface A
{
	int test();
}
class M11 
{
	public static void main(String[] args) 
	{
		A a1 = () ->{
						System.out.println("from test");
						return 200;
					};
		int i = a1.test();
		System.out.println("done with :" +i);
		
	}
}

/*
from test
done with :200

-If multiple statements are there return value should be at 
the return statement.


*/