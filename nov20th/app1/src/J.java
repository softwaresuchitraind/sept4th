class J
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=1;
		while(i<=5)
		{
			System.out.println("loop1 begin:"+ i);
			
			int j=100;
			while(j<=102)
			{
				System.out.println("loop2 begin"+i+","+j);
				if(j==101)
				{
					continue;
				}
				System.out.println("loop2 end"+i+","+j);
				j++;
			}
			System.out.println("body end:"+ i);
			i++;
		}
		System.out.println("main End :" +i);
	}
}
/*
by default continue belong to current loop
continue should not be before changes
*/