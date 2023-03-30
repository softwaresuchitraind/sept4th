class V
{
	public static void main(String[] args) 
	{
		int i=130;
		short j=(short)(byte)(short)i;
		System.out.println(j);
		
	}
}

/*
-126

-If anywhere narrower than required,
then do not do it.

*/