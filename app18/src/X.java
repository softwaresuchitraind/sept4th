class X 
{
	X()
	{
		this();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*

X.java:3: error: recursive constructor invocation
        X()
        ^
1 error

*/