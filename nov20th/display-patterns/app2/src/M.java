class M
{
	public static void main(String[] args) 
	{
		for(char i = 'E'; i >= 'A' ;i--)
		{
			for(char j= 'E'; j>=('A' + 'E' - i);j--)
			{
				System.out.print(i);
			}
		  System.out.println();
		}
		
	}
}


/*
Q22.

EEEEE
DDDD
CCC
BB
A

*/