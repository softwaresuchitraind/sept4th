class X 
{
	X()
	{
	System.out.println("x()");
	}
	X(int i)
	{
	this();
	System.out.println("X(int)");
	}
	public static void main(String[] args) 
	{
		X x1 =new X();
		System.out.println("............");
		X x2=new X(90);
	}
}
   /*this calling statement, 
	-it should be used only constructor not in the method
	-it should be used only as a 1st statement
	-it should be as a calling statement to one of the available constructor
	-recurssion is not allowed by the compiler through this calling statement
	-By default one object creation one constuctor is called,
	   for one object creatiton if we want to execute multiple  
	   constuctor we have to use this.
	-multiple way of initialization is constructor's requirement 
	*/
