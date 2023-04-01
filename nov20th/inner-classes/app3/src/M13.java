class M13 
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			void test1()
			{
				System.out.println("from AIC.test1()");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}

/*
cte
which ever abstract method is inherited that is not implected.
-Anonymous inner class can not be abstract ---u have to implement every method in
the anonymous inner class.
- u can not design anonymos inner class abstract
-Anonymos inner class should always be concrete.
-Through anonymous inner class we can create only one object.
u can not create to more than one more object to the same inner class .why ?

-Anonymous inner class does not have name,if it does not have name how u can refer to second time
to create 2nd object.
-Wherever anonymous inner class is degined there itself we can create an object.
*/