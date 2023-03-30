class Q
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9 ;j++ )
			{
				if(j<=9-i)
				System.out.print(0);
				else
				System.out.print(10-j);
			}
		System.out.println();
		}
	}
}

/*
000000001
000000021
000000321
000004321
000054321
000654321
007654321
087654321
987654321
*/