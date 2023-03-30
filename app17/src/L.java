class L 
{
	int i;
	L()
	{
		i=20;
	}
	public static void main(String[] args) 
	{
		L obj1=new L();
		L obj2=new L();
		System.out.println(obj1.i+", "+obj2.i);
	}
}
/*
For every object creation constructor is executing
*/