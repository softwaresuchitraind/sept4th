class Z4
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
				System.out.print(j-i+1);
				}
			}
			System.out.println();
		}
		
	}
}

/*
123456
 12345
  1234
   123
    12
	 1
	 
*/