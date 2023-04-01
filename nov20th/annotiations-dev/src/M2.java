@interface A
{
	int someDesc();
}

@A(someDesc = 100)
class M2
{
	@A(someDesc = 20)
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}

/*
-Annotation description is not for printing 
-it is for successors.

*/