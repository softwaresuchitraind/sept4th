@interface H
{
	String value();
}
@H("abc")
public class I 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
if any interface having method name value--expliciteky specifying is not mandatory
*/
