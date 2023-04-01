@interface A
{
	int version() default 1;
	String author() default "vijay";
}

@A( author = "abc")
class M7
{
	@A
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}

/*
version and author both are optional
*/