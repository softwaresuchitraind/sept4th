/*
How to change datatype from one object to another object
to change datatype of one object to another object
*/

class A <T, U>
{
	T obj1;
	U obj2;
	void test1(T t1)
	{
	
	}
	U test2()
	{
		return null;
	}
}
class M14
{
	public static void main(String[] args) 
	{
		A<Integer, String> a1 = new A<Integer, String>();
		A<String, String> a2 = new A<String, String>();
		A<Integer,Integer> a3 = new A<Integer,Integer>();
		A<String,Integer> a4 = new A<String,Integer>();
		a1.obj1 = 10;
		a1.obj2 = "abc";

		a2.obj1 = "hello";
		a2.obj2 = "test";

		a3.obj1 = 44;
		a3.obj2 = 55;

		a4.obj1 = "xyz";
		a4.obj2 = 59;
		a1.test1(30);
		String s1 = a1.test2();
		System.out.println("done");
	}
}

/*


done

Object to object we are changeing the datatype
*/