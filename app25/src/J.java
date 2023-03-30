class J
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9 ;j++ )
			{
				if(j<=i)
				System.out.print(i);
				else
				System.out.print(0);
			}
		System.out.println();
		}
	}
}

/*
100000000
220000000
333000000
444400000
555550000
666666000
777777700
888888880
999999999
*/