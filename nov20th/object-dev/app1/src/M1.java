class A
{
	int i;
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i =10;
		System.out.println(a1);//internally a1.toString() method is called
	}
}
/*
A and M contains every method of Object class
A@15db9742
-Hexadecimal representation of memory address.
ClassName@Hexadecimal of memory address

Object class Methods
-------------------
public String toString()
public boolean equals(Object obj)
public int hashCode()
protected void finalise() throws Throwable
protected void clone() throws CloneNotSupportedException
public Class getClass()
7. public class wait()
8. public void notify()
9. public void notifyAll()
-9 methods available in Object class.
-Object class is super class to every class.
-In every class these 9 methods available.
-Object class is available in java.lang package and it is a concrete class.
-

*/