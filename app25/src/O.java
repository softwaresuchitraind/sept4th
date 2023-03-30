class O
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
				System.out.print(1);
			}
		System.out.println();
		}
	}
}

/*
000000001
000000011
000000111
000001111
000011111
000111111
001111111
011111111
111111111
*/