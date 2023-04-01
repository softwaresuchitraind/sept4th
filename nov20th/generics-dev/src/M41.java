class A < T >
{
	T obj;
}
class M41 
{
	public static void main(String[] args) 
	{
		A<?> a1 = null;
		a1 = new A<Number>();
		a1.obj = 20;
		System.out.println("done");
	}
}

/*
cte


G:\nov20th\generics-dev\src>javac -d ../classes M41.java
M41.java:11: error: incompatible types: int cannot be converted to CAP#1
                a1.obj = 20;
                         ^
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Object from capture of ?
1 error


obj datatype is not fixed
Compiler always checks what is a1.


*/