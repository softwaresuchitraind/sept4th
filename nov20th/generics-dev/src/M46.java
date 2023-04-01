class A <T>
{
	T obj;
}
class M46
{
	public static void main(String[] args) 
	{
		A<? extends Number> a1 = null;
		a1 = new A<Object>();
		a1 = new A<Number>();
		a1 = new A<Integer>();
		System.out.println("done");
	}
}

/*
cte- Number or its subclass can be used but not Object


G:\nov20th\generics-dev\src>javac -d ../classes M46.java
M46.java:10: error: incompatible types: A<Object> cannot be converted to A<? extends Number>
                a1 = new A<Object>();
                     ^
1 error

*/