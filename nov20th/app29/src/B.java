class B 
{
	public static void main(String[] args) 
	{
		final int i;
		 i =10;
		int j = 20;
		System.out.println(i);
		System.out.println(j);
		i = 10;
		j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
/*
G:\nov20th\app29\src>javac -d ../classes B.java
B.java:10: error: variable i might already have been assigned
                i = 10;
                ^
1 error

eventhough we are trying to modify with same value we get cte.

*/