@interface A
{
	int version() default 1;
	String author();
}

@A( author = "abc")
class M6
{
	@A( author = "abc" ,version =4)
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}

/*
Through default we can make method declaration not mandatory.
-only other is mandatoy, version is not a mandatory.
*/