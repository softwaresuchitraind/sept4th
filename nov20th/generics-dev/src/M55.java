class A <T>
{
	T var;
}
class M55
{
	public static void main(String[] args) 
	{
		A<int> a1 = new A<int>();
		System.out.println("done");
	}
}

/*
Generic only for Derived not primitives

G:\nov20th\generics-dev\src>javac -d ../classes M55.java
M55.java:9: error: unexpected type
                A<int> a1 = new A<int>();
                  ^
  required: reference
  found:    int
M55.java:9: error: unexpected type
                A<int> a1 = new A<int>();
                                  ^
  required: reference
  found:    int
2 errors

*/