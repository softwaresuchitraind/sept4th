class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
		try
		{
			
			i=10/0;
		}
		catch (ArithmeticException ex)//Throwable
		{
			i=20;// this is executing
		}
		System.out.println("main End" +i);
	}
}
/*
main begin
main End20
if u want to use something inside a try inside a catch that should be declared before try
*/