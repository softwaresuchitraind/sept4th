class H
{
	int i;//i is non static
	public static void main(String[] args) 
	{
		H h1= new H();//object created
		System.out.println(h1.i);
	}
}
/*
o/p-0
Compile successfully and running success
While object is created i is loaded but not when class loaded.
whenever object is created every non static members  are loaded.
h1-derived type variable 
h1 datatype is H class
Derived datatype also called as reference variable.
reference variable referencing to object.
object is a container for non static  member
*/
