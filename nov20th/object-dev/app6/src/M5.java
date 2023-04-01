import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
class A
{
	int i;
	double j;
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
	void test1()
	{
		System.out.println("test1");
	}
	void test2()
	{
		System.out.println("test2");
	}
}
class M5 
{
	public static void main(String[] args) 
		throws Exception
	{
		Class c1 = Class.forName("A");
		Field[] fields = c1.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.print(field+ ":");
			System.out.println(field.getType());
		}
		System.out.println("--------------");
		Method[] methods = c1.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.print(method + ":");
			System.out.println(method.getReturnType());
		}
		System.out.println("-------------------");
		Constructor[] constructors = c1.getDeclaredConstructors();
		for(Constructor constructor : constructors)
		{
			System.out.println(constructor);
		}
		System.out.println("---------------");
	}
}

/*
int A.i:int
double A.j:double
--------------
void A.test1():void
void A.test2():void
-------------------
A()
A(int)
---------------

Why do we require java.lang.Class ?
-If u want to know schema of a class,constructor of class,
Structure of class
-mainly class A is used to know information about class.
-This process is called Reflection API
-inside java.lang there is a separate package reflect

-Lot more geter methods are there


*/