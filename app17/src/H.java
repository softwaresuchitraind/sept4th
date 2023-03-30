class H 
{
	H()
	{
		System.out.println("H()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		H h1= new H();
		System.out.println("Main End");
	}
}
/*
constructor
----------------
constructor should have same name as class name.
constructor should not have return type.
constructor should not be static.
consructor executing autometically while object is creating.
*/
