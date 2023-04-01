/*
How to change datatype from one object to another object
to change datatype of one object to another object
*/

class A < X >
{
	X obj;
}
class M11
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		A<Double> a3 = new A<Double>();
		A a4 = new A();
		a1.obj = 40;
		a2.obj = "abc";
		a3.obj = 4.5;
		a4.obj = new Object();
		System.out.println("done");
	}
}

/*
done

X -java valid identifier
Through generics we can change datatype from one object to another 
object.
All are class A objects

while creating an object we have to specify 
what could be the datatype.

-Generic are introduced in jdk 1.5;


*/