class R
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9 ;j++ )
			{
				if(i==1||i==9||j==1||j==9)
				System.out.print(1);
				else
				System.out.print(0);
			}
		System.out.println();
		}
	}
}

/*
111111111
100000001
100000001
100000001
100000001
100000001
100000001
100000001
111111111
*/