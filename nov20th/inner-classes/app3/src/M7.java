class M7 
{
	public static void main(String[] args) 
	{
		B b1 = new B()
		{
		
		};
		b1.test1();
		System.out.println("done");
	}
}

/*
B-IIB
B()
B-test1
done

-Anonymous inner class in class B
-There is subclas development to class B that subclass is Anonymous inner class.
-there are 2 constructors are exising only one constructor is executing -which we specify 
while designing an anonymous inner class.
- We can not develop a constructor inside a anonymous inner class. why?
Anonymous inner class does not have any name. u have to specify super class constructor name

*/