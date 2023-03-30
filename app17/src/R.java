class R
{
	int i;
	R(int x)
	{
	  i=x;
	}
	
	public static void main(String[] args) 
	{
		R r1= new R();
		System.out.println(r1.i);
	}
}

/*
compile time error
if already there is a constructor compiler will not provide a constructor
no arg constructor is not available
*/