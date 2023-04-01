class O 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
				System.out.println(i);//cte
				System.out.println(j);
			}
		}

		//i= 10;
		System.out.println("done");
	}
}

/*

done 

both local variables acting as a final in local inner class.
i and j can not be modified.


G:\nov20th\inner-classes\app2\src>javac -d ../classes O.java
O.java:11: error: local variables referenced from an inner class must be 
final or effectively final
                                System.out.println(i);
                                                   ^
1 error



-if u use any non final variable used in local inner class,
it is acting as final

-Inside local variables all final variables allowed to use,or the variables 
acting as final can be used.


*/