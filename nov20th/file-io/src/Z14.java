import java.io.Console;
class Z14 
{
	public static void main(String[] args) 
	{
		Console c1 = System.console();
		Console c2 = System.console();
		Console c3 = System.console();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
/*
java.io.Console@3d4eac69
java.io.Console@3d4eac69
java.io.Console@3d4eac69

-Console class introduced in jdk 1.6
-Inside a Console class only private constructors are available.
-We can not create an Object to Console class.
-To get a reference we have to use System.console().
-Console class is a Singleton class,only one object for entire execution.
-Whenever program is running in eclipse we will not get console Object.
-If java command triggering from command prompt then Console Object is created.


*/