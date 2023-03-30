class S 
{
	S()
	{
		int i = 10;
		this(90);
	}
	S(int i)
	{
	
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


/*
S.java:6: error: call to this must be first statement in constructor
                this(90);
                    ^
1 error
*/