class B
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();//propagateing/ducking/delegation
		System.out.println(2);
	}
	public static void test()
	{
		System.out.println(3);
		int i=10/0;//unhandeled exception
		System.out.println(4);
	}
}
/*
Remaing portion of main is not executed
main method is removing form ...stack
*/