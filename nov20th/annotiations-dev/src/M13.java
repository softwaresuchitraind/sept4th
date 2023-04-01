@F(message = "abc")
class M13 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*

Hello World!

Through annotation not only for successor--
- any configuration information

source--- not moving to class file
CLASS--javac command generationg binary code for annotation 
moving into the class file
TIME--- one class is loading it is going to runtime also

-If the retention policy is runtime that annotation defination
will be loading into the memory.

*/