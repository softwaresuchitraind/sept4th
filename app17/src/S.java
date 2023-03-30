class S 
{
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		System.out.println("S(int)");
	}

	public static void main(String[] args) 
	{
		S s1=new S();
		System.out.println("__________");
		S S2= new S(20);
	    System.out.println("__________");
		S S3= new S();
	    System.out.println("__________");

	}
}
/*
in one class we can have any number of constructors.
while developing multiple constructor every constructor signature should change.
either data type or number of arguments should change.
constror overloading
....................
Developing multiple constructors in the same class by choosing different signature
is called constructor overloading.
While object is creating we have to specify which avaliable constuctor we use.
By using one constructure we can create any number of objects

even though class containing multiple constructors while object is creating only specified
constructor is executing only one not multiple.
*/