class A <T>
{
	static T obj;
	static void test(T arg)
	{
	}
}
class M56 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
Static can not be used in generic.
-Generics is used for coverting one datatype with other

-Generic datatype can not use in static members
-static is common to every object,Generic is used for differing to object to object
-changeing datatype from one object to another object.





G:\nov20th\generics-dev\src>javac -d ../classes M56.java
M56.java:3: error: non-static type variable T cannot be referenced from a static context
        static T obj;
               ^
M56.java:4: error: non-static type variable T cannot be referenced from a static context
        static void test(T arg)
                         ^
2 errors
*/