class A <T>
{
	T obj;
}
class M45
{
	public static void main(String[] args) 
	{
		A<? extends Number> a1 = null;
		a1 = new A<String>();
		a1 = new A<Number>();
		a1 = new A<Integer>();
		System.out.println("done");
	}
}

/*
cte- u can not supply String


G:\nov20th\generics-dev\src>javac -d ../classes M45.java
M45.java:10: error: incompatible types: A<String> cannot be converted to A<? extends Number>
                a1 = new A<String>();
                     ^
1 error



a1 is allowed to assign Number or subclass to Number.

*/