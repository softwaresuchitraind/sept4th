class A <T>
{
	T obj;
}
class M51 
{
	public static void main(String[] args) 
	{
		A<? super Number> a1 = null;
		a1 = new A<Number>();
		a1 = new A<Object>();
		a1 = new A<Integer>();
		a1 = new A<String>();
		System.out.println("done");
	}
}

/*

G:\nov20th\generics-dev\src>javac -d ../classes M51.java
M51.java:12: error: incompatible types: A<Integer> cannot be converted to A<? super Number>
                a1 = new A<Integer>();
                     ^
M51.java:13: error: incompatible types: A<String> cannot be converted to A<? super Number>
                a1 = new A<String>();
                     ^
2 errors
*/
