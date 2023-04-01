class A<T>
{
	T obj;
}
class M48 
{
	public static void main(String[] args) 
	{
		A<? extends Number> a1 = new A<Integer>();
		a1.obj = 9000;
		System.out.println("done");
	}
}

/*
cte- lots of operations available

G:\nov20th\generics-dev\src>javac -d ../classes M48.java
M48.java:10: error: incompatible types: int cannot be converted to CAP#1
                a1.obj = 9000;
                         ^
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Number from capture of ? extends Number
1 error



u can not assign any value to obj.
*/
