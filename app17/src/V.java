class V 
{
	V(int i,int j)
	{
		System.out.println("V(int,int)");
	}
	V(int i,double j)
	{
		System.out.println("V(int,double)");
	}
	public static void main(String[] args) 
	{
		V v1= new V(10,20);
		System.out.println("...........");
		V v2= new V(20,3.4);
	}
}
/*
Any number of constructor can be overloaded by varying number of arguments and datatype.
While creating object we have to specify.
*/
