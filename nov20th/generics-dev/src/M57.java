interface A <T>
{
	T obj;
}
class M57
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*


G:\nov20th\generics-dev\src>javac -d ../classes M57.java
M57.java:3: error: = expected
        T obj;
             ^
1 error


-By default every attribute is static.
obj is a attribute in interface.
-Every interface attribute is a perfect constant.


*/