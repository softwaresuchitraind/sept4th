class Z3
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6;i++ )
		{
			for (int j=1;j<=6;j++ )
			{
				if(j<=(i-1))
				{
				System.out.print(" ");
				}
				else
				{
				System.out.print(0);
				}
			}
			System.out.println();
		}
		
	}
}

/*
0000000
 000000
  00000
   0000
    000
	 00
	  0
*/