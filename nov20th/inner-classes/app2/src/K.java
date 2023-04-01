class K 
{
	public static void main(String[] args) 
	{
		class A
		{
			void test()
			{
				System.out.println("from A");
			}
		}
		A a1 = new A();
		a1.test();
		System.out.println("done");
	}
}

/*

from A
done

3rd variety of inner class is local inner class

-in any variable is local to defination block that is local variable.
-if a class is declared inside a method,block,iib etc that 
class is called local inner class.
-Local inner class can not be accessed from outside.


A is a Local inner class in the main method.
A is visible in only in the main() not outside.


*/
