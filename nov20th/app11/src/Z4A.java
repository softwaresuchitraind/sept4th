/*
30. Reverse the elements of given array without using temporary variable? 
*/
class Z4A
{
	public static void main(String[] args) 
	{
		//int []x={3,6,1,10,4,6,9,12};
		//		  0 1 2 3 4 5 6  7
		int []x={3,6,1,10,4,6,9,12,40};
		//		  0 1 2 3 4 5 6  7
		System.out.println("initial array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();

		for(int i=0;i<x.length/2;i++)
		{
			
			x[i] = x[i] + x[x.length-i-1];
			x[x.length-i-1]= x[i]- x[x.length-i-1];
			x[i] = x[i]- x[x.length-i-1];
		}

		System.out.println("final array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
	}
}
