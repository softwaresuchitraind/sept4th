class H
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9 ;j++ )
			{
				if(j<=i)
				System.out.print(1);
				else
				System.out.print(0);
			}
		System.out.println();
		}
	}
}

/*
100000000
110000000
111000000
111100000
111110000
111111000
111111100
111111110
111111111
*/