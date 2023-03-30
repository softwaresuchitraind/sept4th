class F
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
		
	}
}

/*
G:\sept4th\exceptions\app3\src>javac -d ../classes F.java
F.java:6: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Class.forName("");
                             ^
1 error

compiler expects a try and catch.
it is a checked exception.compiler knows every statement which rising.javac command aware of every statement of checkedException.

*/