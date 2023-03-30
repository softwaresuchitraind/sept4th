class Y 
{
	static
	{
		System.out.println("Y.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Y.main begin");
		System.out.println(X.i);
		System.out.println("...........");
		W.test();
		System.out.println("...........");
		W.test();
		System.out.println("Y.main End");
	}
}

//compile it in Test.java but run in Y.java
//static members are loading to the memory only one time not multiple time.
//Any class while using 1st time every static members are loading into memory not the non static  members
//Class is loading one time.
//static members are class members.
//while using static member use along with the class name
//while using static member of one class with anothe class you have to use along with the class name.


