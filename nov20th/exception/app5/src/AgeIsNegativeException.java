//user specific abnormal class
class AgeIsNegativeException extends ArithmeticException 
{
	AgeIsNegativeException()
	{
	
	}
	AgeIsNegativeException(String msg)
	{
		super(msg);
	}
}

/*
u can use this class for catch argument
*/