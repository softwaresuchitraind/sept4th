class K extends Object
{
	K()//not inheriting to subclass
	{
		System.out.println("K()");
	}
}
class L extends K

{
	L()
	{	
		System.out.println("L()");//L() call to k() with Super()
	}
	public static void main(String[] args) 
	{
		L obj1= new L();
		System.out.println("----------");
		K obj2= new K();
		System.out.println("----------");
	}
}
/*
K()
L()
------
K()
-----------

super class constructor/initializers/IIBS/SIBS  will not inherited to subclass. 

In every constuctor body 1st statement should be this() or super();
this()
this(12)
this(1,2)
this(1,2,'abc');

..........
super();
super(10);
super(1,2);
super(5,"abc");

if u don't provide compile will provide super with no arg i.e super();

if any class does not have extends then compiler extend Object.
Object is one of the build in class in java.lang package
Object class is supermost class for every class.

Every class should be child to one class
unfortunately if any class dont extends compiler extends Object

Every class is subclass to Object class

Supermost class--Object

*/
