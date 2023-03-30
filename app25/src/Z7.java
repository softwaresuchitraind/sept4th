class Z7
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6;i++ )
		{
			for (int j=1;j<=6;j++ )
			{
				if(j<=(6-i))
				{
					System.out.print(" ");
				}
				else
					System.out.print(0);
						
				
			}
			System.out.println();
		}
		
	}
}

/* 
     0
	00
   000
  0000
 00000
000000
	 
*/