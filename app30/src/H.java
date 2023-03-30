class H 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=13;i++)
		{
		  if(i<=7)

			{
			 for(int j=1;j<=7-i;j++)
				{
					System.out.print(" ");
			    }
			 for(int j=1;j<=i;j++)
				{
					System.out.print(0);
			 
				}

				
			}
			else
			{
				
				for(int j=1;j<=i-7;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(13-i)+1;j++)
				{
				System.out.print(0);
				}

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
0000000
 000000
  00000
   0000
	000
	 00
	  0

*/