interface A
{
	void test();
}
class M6
{
	
	public static void main(String[] args) 
	{
		A a1 = () -> {
						System.out.println("from test");
						System.out.println("from test");
						System.out.println("from test");
						System.out.println("from test");
						System.out.println("from test");
					};
			
		a1.test();
		System.out.println("done");
	}
}

/*
if more statements are there we need braces.lamda expressions used in jdk 1.8
-lamda expressions are for single method interfaces.


from test
from test
from test
from test
from test
done


*/