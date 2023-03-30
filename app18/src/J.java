class J 
{
	static int x;
	public static void main(String[] args) 
	{
		J obj= new J();
		System.out.println(x);
		System.out.println(J.x);
		System.out.println(obj.x);//compiler replaces reference variable to class name
	}
}

/*
static can be used straight way in main method.
static members can be used in class name.
reference variable can also access static variable.
*/
