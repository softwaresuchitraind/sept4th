class J 
{
	 static void test(int x,final int y)
	{
		 x=10;
		 y=10;//cte
		System.out.println("---------");
		x=10;
		y=10;//cte
		System.out.println("----------");
	}
}

/*
cte
while calling we have to supply value of x and y,afterwords we should not modify.

*/