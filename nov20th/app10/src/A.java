class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		do
		{
			//it is allowing to execute one time no matter boolean condition
			System.out.println("loop body:"+i);
			i++;
		}
		while (i<=5);
		System.out.println("main end");
	}
}
/*
Initialisation should be before loop.
while entering to the loop no boolean condition

Sntax
-whichever variable u are using in boolean condition that variable
should not be local to body of the loop.
-local variables of do while can not be used in the boolean condition
of the do while.
-loop should end with the semicolon.
-if not ended with semicolon then all state ments consider the part of the semicolon.
*/