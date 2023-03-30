class P
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
				System.out.print(i+j-9);
			}
		System.out.println();
		}
	}
}

/*
000000001
000000012
000000123
000001234
000012345
000123456
001234567
012345678
123456789
*/