class Q
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=1;
		//any valid java identifier
		loop1: 
		while(i<=5)
		{
			System.out.println("loop1 begin:"+ i);
			i++;
			int j=100;
			loop2:
			while(j<=102)
			{
				System.out.println("loop2 begin"+i+","+j);
				j++;
				if(j==101)
				{
					break loop1;
				}
				System.out.println("loop2 end"+i+","+j);
			
			}
			System.out.println("body end:"+ i);
			
		}
		System.out.println("main End :" +i);
	}
}
/*
Main begin
loop1 begin:1
loop2 begin2,100
main End :2

*/