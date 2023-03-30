//homework
class K
{
	public static void main(String[] args) 
	{
		int rows=8;
	    int firsthalf=(rows/2)+1;
		for(int i=1;i<=rows;i++)
		{
			
			
			if(i<=firsthalf)
			{
			for(int j=1;j<(firsthalf-i+1);j++)
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

0000 0000
000   000
00     00


00     00
000   000
0000 0000

*/