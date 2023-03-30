class T 
{
	T()
	{
	
	}
	T(int i)
	{
		System.out.println("done");
		this();
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
T.java:10: error: call to this must be first statement in constructor
                this();
                    ^
1 error

*/