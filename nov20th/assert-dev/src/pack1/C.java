package pack1;
class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false : "something went wrong";
		System.out.println(2);
	}
}
/*

G:\nov20th\assert-dev\src>javac -d ../classes pack1/C.java

G:\nov20th\assert-dev\src>java -cp ../classes -ea pack1.C
1
Exception in thread "main" java.lang.AssertionError: something went wrong
        at pack1.C.main(C.java:7)

G:\nov20th\assert-dev\src>java -cp ../classes pack1.C
1
2

-By defaut assert statements are not executing u have to enable it.
*/