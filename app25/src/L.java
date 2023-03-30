class L
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9 ;j++ )
			{
				if(j<=i)
				System.out.print(10-j);
				else
				System.out.print(0);
			}
		System.out.println();
		}
	}
}

/*
900000000
980000000
987000000
987600000
987650000
987654000
987654300
987654320
987654321
*/