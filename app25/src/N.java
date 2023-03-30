class N
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9 ;j++ )
			{
				if(j<i)
				System.out.print(j);
				else
				System.out.print(0);
			}
		System.out.println();
		}
	}
}

/*
000000000
100000000
120000000
123000000
123400000
123450000
123456000
123456700
123456780
*/