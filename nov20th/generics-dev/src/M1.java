class A
{
	int i;
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;

		A a2 = new A();
		a2.i = 30;
		System.out.println("done");
	}
}

/*
-For every Object of A , i datatype is int
-We can not change the data type of i
-Datatype of i remains same.


-Generics introduced in 1.5
-Why do we require generics ?
*/
