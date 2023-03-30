class Z6
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
					if(i==1||i==6||j==6||i==j)
						{
							System.out.print(1);
						}
					 else
						{
						System.out.print(0);
						}
				}
			}
			System.out.println();
		}
		
	}
}

/*
111111
 10001
  1001
   101
    11
	 1
	 
*/