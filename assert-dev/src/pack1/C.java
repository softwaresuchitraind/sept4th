package pack1;
class C 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false:"Something went wrong";
		System.out.println(2);
	}
}
/*
G:\sept4th\assert-dev\src>javac -d ../classes pack1/C.java

G:\sept4th\assert-dev\src>java -cp ../classes pack1.C
1
2


G:\sept4th\assert-dev\src>java -cp ../classes -ea pack1.C
1
Exception in thread "main" java.lang.AssertionError: Something went wrong
        at pack1.C.main(C.java:7)14-11-2017

-By default no assert statement is executing.
to execute we have to supply -ea
*/