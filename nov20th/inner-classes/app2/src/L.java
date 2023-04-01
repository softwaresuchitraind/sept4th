class L 
{
	public static void main(String[] args) 
	{
		void test()
		{
			System.out.println("from A");
			System.out.println("from A");
			System.out.println("from A");
			System.out.println("from A");
		}
		test();
		test();
		test();
		System.out.println("done");
	}
}

/*
-u can not de develop method inside a method.
-methods can not be declare to any defination block.
-methods should be a member of class
cte
-methods can not be a member to constructor,iib,sib etc,method 
should always be a members to a class.


nesting of method is not possible in java.

to address this one Local inner classes.

*/