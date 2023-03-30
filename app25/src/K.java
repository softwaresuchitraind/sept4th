class K
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9 ;j++ )
			{
				if(j<=i)
				System.out.print(10-i);
				else
				System.out.print(0);
			}
		System.out.println();
		}
	}
}

/*
900000000
880000000
777000000
666600000
555550000
444444000
333333300
222222220
111111111
*/