class A 
{
	public static void main(String[] args)	
	{
		final int i=10;
		int j=20;
		System.out.println(i);
		System.out.println(j);
		i=10;//reinitialization
		j=20;
		System.out.println(i);
		System.out.println(j);
	}
}
/*
cte
-final variables can be used any number of times.
-We can not reinitialize the final variable.
-final variables are only for one value purpose.

*/