class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			void test1()
			{
				System.out.println("AIC.test1()");
			}
		};
		a1.test1();
		a1.test2();
	}
}

/*
-Inside main() we are declaring a class without name 
that is called Anonymous inner class.
-a1 pointing to an object of subclass to A
-a1 is not pointing to A itself.

AIC.test1()
from A.test2


for anonymos inner class we can not design second object.
Why we do not create a second object to anonymos inner class ?
 it does not have name - how we can refer again.


*/