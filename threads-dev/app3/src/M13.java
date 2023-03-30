interface A
{
	void test();//only one method
}

class M13
{
	public static void main(String[] args) 
	{
		//Any number of statements we can provide
		A a1=()-> {
						System.out.println("lamda.test()");
						System.out.println("lamda.test()");
						System.out.println("lamda.test()");
						System.out.println("lamda.test()");
						System.out.println("lamda.test()");
				};
		
		a1.test();
		System.out.println("done");
	}
}
/*

*/