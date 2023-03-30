class  T
{
	final int i;
	T()
	{
		i=10;
	}
	T(int x)

	{
		this();
		i=20;
	}
}

/*
T.java:12: error: variable i might already have been assigned
                i=20;
                ^
1 error

-We are not creating objects or not statemements should be syntatically correct.

*/