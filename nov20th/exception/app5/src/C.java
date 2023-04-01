class C 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if (true)
		{
			System.out.println("from if");
			throw new OutOfMemoryError("something went wrong");
		}
		System.out.println(2);
	}
}
/*
not only exception but also error also.error is also type of Throwable.
Dont consider compile time errors,those are syntax errors.
Catch argument always Throwable type,it can be exception or error type.
for throws class we can use any throwable type.

-for throw also we can also use any Throwable type.
*/