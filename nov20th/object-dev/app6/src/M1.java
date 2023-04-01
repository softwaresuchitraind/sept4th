class A
{
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		Class c1 = a1.getClass();
		Class c2 = a2.getClass();
		Class c3 = a3.getClass();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
	}
}
/*
c1,c2 and c3 all are refering to same object.
from the Object class getClass() method is inheriting.

-Class is a build in class in java.lang package.
-getClass() method is a object class method. returning reference
of Class object.


class A
class A
class A
true
true
*/    