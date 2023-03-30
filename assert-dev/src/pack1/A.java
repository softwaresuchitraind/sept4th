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
assert statement can be used anywhere.
By default no assert statements are executting
to execute the assert statement we have to supply one


G:\sept4th\assert-dev\src>java -cp ../classes pack1.A
1
2

G:\sept4th\assert-dev\src>java -cp ../classes -ea  pack1.A
1
Exception in thread "main" java.lang.AssertionError
        at pack1.A.main(A.java:7)


-u can use try catch to handle AssertionError.


*/