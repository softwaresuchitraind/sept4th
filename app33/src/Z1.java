class Z1
{
	final static int i=10;//perpect constant for entire execution
	static
	{
		i=10;
	}

}

/*
Z1.java:6: error: cannot assign a value to final variable i
                i=10;
                ^
				_Attempting to reinitialize
*/