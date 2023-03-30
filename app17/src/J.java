class J 
{
	int x=10;//non-static initializer
	J()//non-static initializer
	{
		System.out.println("j() "+x);
		x=20;
	}

	public static void main(String[] args) 
	{
		J j1=new J();
		System.out.println("Main :" +j1.x);
	}
}

/*
Whenever objects are created non static members are loading into memory.
*/