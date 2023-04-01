class N
{
	public static void main(String[] args) 
	{
		for(char i = 'E'; i >= 'A' ;i--)
		{
			for(char j= 'E'; j>=('A' + 'E' - i);j--)
			{
				System.out.print(j);
			}
		  System.out.println();
		}
		
	}
}


/*
Q23.

EDCBA
EDCB
EDC
ED
E
A

*/