class A <T>
{
	T obj;
}
class M59
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<String>();
		System.out.println("done");
	}
}

/*


G:\nov20th\generics-dev\src>javac -d ../classes M59.java
M59.java:9: error: incompatible types: A<String> cannot be converted to A<Integer>
                A<Integer> a1 = new A<String>();
                                ^
1 error

*/