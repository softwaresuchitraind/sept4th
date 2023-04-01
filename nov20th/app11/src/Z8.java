/*
34. Reverse only odd indexed of the elements of given array
*/
class Z8
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12,8,7,30};
		//		  0 1 2 3 4 5 6  7 8 9 
	
		System.out.println("initial array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();

		int lastOddIndex=
			x.length%2 == 0 ? x.length - 1 : x.length -2 ;

		for (int i=1;
		i<(x.length/2);
		i+=2,lastOddIndex -=2 )
		{
			if(i == lastOddIndex)
			{
				continue;
			}
			x[i] = x[i] + x[lastOddIndex];
			x[lastOddIndex]= x[i]- x[lastOddIndex];
			x[i] = x[i]- x[lastOddIndex];
		}

		System.out.println("final array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
	}
}
