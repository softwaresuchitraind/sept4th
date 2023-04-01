class A
{
	@Deprecated
	void test1()
	{
	}
	void test2()
	{
	}
}
class M17 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		a1.test2();
		System.out.println("Hello World!");
	}
}

/*
G:\nov20th\annotiations-dev\src>javac -d ../classes M17.java
Note: M17.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

G:\nov20th\annotiations-dev\src>java -cp ../classes M17
Hello World!

-When ever Deprecates u will get compilation notes

Deprecated ---outdated method--still u can use ---there is no wrong on 
using outdated method.


to know which method is deprecated


G:\nov20th\annotiations-dev\src>javac -d ../classes -Xlint:deprecation M17.java
M17.java:16: warning: [deprecation] test1() in A has been deprecated
                a1.test1();
                  ^
1 warning


@SuppressWarnings("deprecation")

- u r telling javac command not to provide any warning related to annotation.
SuppressWarnings is another Annotations
-Deprecation type of warning to be igonred.


*/