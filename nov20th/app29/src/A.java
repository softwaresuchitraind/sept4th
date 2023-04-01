class A 
{
	public static void main(String[] args) 
	{
		final int i = 10;
		int j = 20;
		System.out.println(i);
		System.out.println(j);
		i = 10;//cte
		j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
//final variable should not be modified