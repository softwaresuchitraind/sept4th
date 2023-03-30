class Z
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6;i++ )
		{
			for (int j=1;j<=(7-i);j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}

/*
123456
12345
1234
123
12
1
*/