package pack1;
class A
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false;
		System.out.println(2);
	}
}

/*

G:\nov20th\assert-dev\src>javac -d ../classes pack1/A.java

G:\nov20th\assert-dev\src>java -cp ../classes pack1.A
1
2

------
-by default asset statements are not executing by default.


G:\nov20th\assert-dev\src>java -cp ../classes  -ea pack1.A
1
Exception in thread "main" java.lang.AssertionError
        at pack1.A.main(A.java:7)

-
*/
