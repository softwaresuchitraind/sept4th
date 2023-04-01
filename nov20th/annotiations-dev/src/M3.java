@interface A
{
	int version();
	String author();
}

@A(version = 3, author = "abc")
class M3
{
	@A(version =4, author = "xyz")
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}

/*
-Two description declaration
-u have to provide a value to both version and also for the author.

*/