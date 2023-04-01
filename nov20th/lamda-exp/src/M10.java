interface A
{
	int test();
}
class  M10
{
	public static void main(String[] args) 
	{
		A a1 = () -> 200;
		int i = a1.test();
		System.out.println("done with :" +i);
	}
}

/*
only  retun value so donot require

done with :200

-Lamda expressions are only for reducing number of statements

*/
