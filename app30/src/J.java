class J
{
	public static void main(String[] args) 
	{
		int rows=9;
	    int firsthalf=(rows/2)+1;
		
		for(int i=1;i<=rows;i++)
		{
			if(i==1||i==rows)

			{
				for(int j=1;j<=rows;j++)
				{
					System.out.print(0);
				}
				System.out.println();
				continue;
			
			}
			if(i<=firsthalf)
			{
			for(int j=1;j<=(firsthalf-i+1);j++)
				{
					System.out.print("0");
			    }
			for(int j=1;j<=((i-1)*2-1);j++)
				{
					System.out.print(" ");
			    }
			for(int j=1;j<=(firsthalf-i+1);j++)
				{
					System.out.print("0");
			    }
			}
			else
			{
				for(int j=1;j<=(i-firsthalf+1);j++)
				{
				  System.out.print("0");
				}
				for(int j=1;j<=((rows-i)*2-1);j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(i-firsthalf+1);j++)
				{
				  System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}
}

/*
000000000
0000 0000
000   000
00     00
0       0
00     00
000   000
0000 0000
000000000
*/