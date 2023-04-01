@interface A
{
	String someDesc();
}

@A(someDesc = "some desc about A")
class M1
{
	@A(someDesc = "some desc about main")
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}

/*
Annotation  description is not for printing purpose
*/