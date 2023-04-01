class M 
{
	public static void main(String[] args) 
	{
		class A
		{
		
			void test()
			{
				System.out.println("from A");
				System.out.println("from A");
				System.out.println("from A");
				System.out.println("from A");
			}
		}
		A a1 = new A();
		a1.test();
		a1.test();
		a1.test();
		System.out.println("done");
	}
}

/*
-inside a method body some porttion duplicatiing again and again
-inside main method there is a class A


G:\nov20th\inner-classes\app2\src>java -cp ../classes M
from A
from A
from A
from A
from A
from A
from A
from A
from A
from A
from A
from A
done
*/