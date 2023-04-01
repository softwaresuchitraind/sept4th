class M14 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("Hello World!");
	}
}

/*

G:\nov20th\inner-classes\app3\src>javac -d ../classes M14.java
M14.java:5: error: D is abstract; cannot be instantiated
                D d1 = new D();
                       ^
1 error

cte
We can not create an object to interface
*/
