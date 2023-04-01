class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			void test1()
			{
				System.out.println("AIC.test1()");
			}
		
			void test2()
			{
				System.out.println("AIC.test2()");
			}
			void test3()
			{
				System.out.println("AIC.test3()");
			}
		};
		a1.test1();
		a1.test2();
		a1.test3();
	}
}

/*
cte
compiler is bothing about what is a1 not where a1 pointing to,
compiler searching for a1 in A class.
what is new method develop in anonymous inner class
that can not be called outside as
anonymous inner class having no name.

a1 is a A type so by using a1 test1() and test2() can be accessed.
so u can not use new members of inner class from outside.




G:\nov20th\inner-classes\app3\src>javac -d ../classes M5.java
M5.java:23: error: cannot find symbol
                a1.test3();
                  ^
  symbol:   method test3()
  location: variable a1 of type A
1 error
*/