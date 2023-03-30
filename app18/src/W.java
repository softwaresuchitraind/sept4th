class W
{
	W(int i)
	{
		this();
	}
	W()
	{
		this(10);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
G:\sept4th\app18\src>javac -d ../classes W.java
W.java:3: error: recursive constructor invocation
        W(int i)
        ^
1 error



-1st constructor calling second second calling third is not possible.

*/