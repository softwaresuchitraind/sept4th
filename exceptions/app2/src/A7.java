class  A7
{
	int test(boolean flag)
	{
		if(flag)
		{
			return 20;
		}
		else
		{
			return 10;
		}
		return 30;
	}
}
/*
A7.java:13: error: unreachable statement
                return 30;
                ^
1 error

return 30  will never execute
*/