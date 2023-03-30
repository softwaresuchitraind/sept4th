class W
{
	W(int i,int j)
	{
		System.out.println("W(int,int)");
	}
}
class X extends W
{
	
	public static void main(String[] args) 
	{
		System.out.println(" Done");
	}
}
/*

compile time error
in x class compiler only generates no arg constructor
in the body super() available but this is nt available in W
*/