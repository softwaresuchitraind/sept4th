/*
How to change datatype from one object to another object
to change datatype of one object to another object
*/

class A < X >
{
	void test(X obj)
	{
		
	}
}
class M12
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		A<Double> a3 = new A<Double>();
		a1.test(10);
		a2.test("abc");
		a3.test(2.5);
		System.out.println("done");
	}
}

/*

Through generics we can change datatype from one object to another object.
All are class A objects

while creating an object we have to specify what could be the datatype.

-Generic are introduced in jdk 1.5;


*/