class Q
{
	Q(int i)
	{
		System.out.println("Q(int)");
	}
}
class R extends Q
{
	R(int i)//compiler kept super();
	{
		System.out.println("R(int)");
	}

	public static void main(String[] args) 
	{
		//R r1=new R(90);
		System.out.println(" Done");
	}
}
/*
compile time error
inside Q class no arg constructor is not available
//even we are not using R class constructor we are geting compile time error.
*/
