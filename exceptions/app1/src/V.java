class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int []x=new int[9];
			System.out.println(2);
		}
		catch (OutOfMemoryError ex)//Throwable
		{
			ex.printStackTrace();//the message for an exception
		}
		System.out.println("main End");
	}
}
/*

main begin
1
2
main End
- Catch will not execute.
- if try execute successfully no catch is executed
-As try got executed very successfully,catch will not be executing.
-No abnormal condition

*/