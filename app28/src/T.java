class T
{
	public static void main(String[] args) 
	{
		int i=128;
		short j=(byte)i;
		System.out.println(j);
		
	}
}

/*
-128
Do not narrow narrower than required
*/