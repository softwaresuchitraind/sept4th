class B
{
	public static void main(String[] args) 
	{
		final int i;
		i=10;//attempting to one more value gives cte---first time doesn't give cte
		int j=20;
		System.out.println(i);
		System.out.println(j);
		i=10;//---this gives cte
		j=20;
		System.out.println(i);
		System.out.println(j);
	}
}
/*
cte
final variables can be declared without initialization,
we can initialize afterwords but only one time.
Attempting to reinitialize gives cte even though same value.

*/