class G
{
	{
		System.out.println("G-IIB");
	}
	G()
	{
		System.out.println("G()");

	}
}
class  H extends G
{
	H()
	{
		System.out.println("H()");

	}
	H(int i)
	{
		this();
		System.out.println("H(int)");

	}
	{
		System.out.println("H-IIB");

	}
	public static void main(String[] args) 
	{
		G g1 =new G();
		System.out.println("........");
		H h1= new H();
		System.out.println("..........");
		H h2= new H(20);
		System.out.println("..........");

	}
}
/*
even though multiple constuctor iib executes once.
if 1st statement is this then IIB statement is not executing
*/
