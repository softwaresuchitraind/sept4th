class A <T>
{
	T obj;
}
class M62
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<>();
		A a2 = new A();
		a1 = a2;
		a2 = a1;
		a1.obj = 1000;
		a2.obj = 1000;
		int i = a1.obj;
		int j = a2.obj;
		System.out.println("done");
	}
}

/*
G:\nov20th\generics-dev\src>javac -d ../classes M62.java
M62.java:16: error: incompatible types: Object cannot be converted to int
                int j = a2.obj;
                          ^
Note: M62.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error


-Object type can not be down casting to int is not done autometically.


-We are able to use interchangeable but have to use down casting
*/