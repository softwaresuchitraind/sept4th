class Z5
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
				System.out.print(7-j);
				}
			}
			System.out.println();
		}
		
	}
}

/*
654321
 54321
  4321
   321
    21
	 1
	 
*/