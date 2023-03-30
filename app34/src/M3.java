abstract class A
{
	static abstract void test1();
}
class  M3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
M3.java:3: error: illegal combination of modifiers: abstract and static
        static abstract void test1();
                             ^
1 error
--static  method development is only one time,whichever unable to change further
--if we declare static method as final we get cte
--abstract and static is illigal combination.
--abstract method should not be final and static
*/