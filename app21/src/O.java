abstract class A
{
	
	abstract void test1();
	abstract void test2();
	abstract void test3();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("B.test1()");
	}
}  
abstract class C extends B
{
	void test2()
	{
		System.out.println("C.test2()");
	}
}  
 class D extends C //abstract keyword is not necessary as every method is concrete
{
	void test3()
	{
		System.out.println("D.test3()");
	}
}
class O

{
	public static void main(String[] args) 
	{
		//A a1= new A();
		//B b1= new B();
		//C c1= new C();
		D d1= new D();
		d1.test1();
		d1.test2();
		d1.test3();
		System.out.println("Hello World!");
	}
}
/*
-we can not create an object to abstract class.
-There is no way of creating an object to abstract class.
-whenever object is creating constuctor is executing.
-Is it possible to give a consturctor to abstract class.
   *yes
   *every class contains atleast one class.
   * Inside abstract class we can declare any number of constructor.
   *if you are not providing any constructor ,compiler is providing a constuctor to abstract class.

 -When constuctor is executed ?
   * when object of concrete subclass of abstract class. 
*/
