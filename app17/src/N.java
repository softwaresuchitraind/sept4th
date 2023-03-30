class N 
{
	int i;
	N(int x)//constuctor can take any number of argument like method
	{
		i=x;
	}
	public static void main(String[] args) 
	{
		N obj1=new N(500);
		N obj2=new N(600);
		N obj3=new N(700);
		System.out.println(obj1.i+", "+obj2.i+", "+obj3.i);
		

	}
}

/*
While object is created we have to supply value
*/