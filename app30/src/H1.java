class H1 
{
	public static void main(String[] args) 
	{
		int rows=9;
	    int firsthalf=(rows/2)+1;
		for(int i=1;i<=rows;i++)
		{
			if(i<=firsthalf)
			{
			for(int j=1;j<=(firsthalf-i);j++)
				{
					System.out.print(" ");
			    }
			for(int j=1;j<=((i-1)*2+1);j++)
				{
					System.out.print(0);
			    }
			}
			else
			{
				for(int j=1;j<=(i-firsthalf);j++)
				{
				  System.out.print(" ");
				}
				for(int j=1;j<=((rows-i)*2+1);j++)
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}
}

/*
    0
   000
  00000
 0000000
000000000
 0000000
  00000
   000
    0

*/