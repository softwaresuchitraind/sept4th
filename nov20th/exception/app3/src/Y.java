class A
{
	A()throws ClassNotFoundException
	{
	}
}
class Y extends A 
{
	Y()
	{
		try
		{
			super();
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
G:\nov20th\exception\app3\src>javac -d ../classes Y.java
Y.java:13: error: call to super must be first statement in constructor
                        super();
                             ^
1 error


*/