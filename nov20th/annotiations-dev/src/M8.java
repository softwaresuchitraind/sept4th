@interface A
{
	int version() default 1;
	String author() default "vijay";
	String platform() default "windows";
}

@A(author = "abc")
class M8
{
	@A(author = "manu")
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}