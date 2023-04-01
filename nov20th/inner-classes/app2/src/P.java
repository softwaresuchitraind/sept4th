class P 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		A a1 = new A();
		a1.test();
		i =20;
		a1.test();
		System.out.println("done");
	}
}

/*
local variables act as final in the inner class that should not be modified.


G:\nov20th\inner-classes\app2\src>javac -d ../classes P.java
P.java:11: error: local variables referenced from an inner class must be final or effectively final
                                System.out.println(i);
                                                   ^
1 error


10
10
done

*/