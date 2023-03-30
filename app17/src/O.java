class O 
{
	int i;
	O(int x)
	{
		i=x;
	}
	public static void main(String[] args) 
	{
		O ref=new O();
		System.out.println(ref.i);
	}
}

/*
compile time error 
we have to supply one argument to consrtuctor.
*/
