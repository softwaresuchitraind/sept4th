/*
29. Swap two given indexed elements from the array without temporary variable? 
*/
class Z3A
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12};
		//		  0 1 2 3 4 5 6  7
		System.out.println("initial array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();

		
		
		x[3] = x[3] + x[6]; // x[3]=10 + 9 = 19
		x[6] = x[3] -x[6]; // x[6]=19 -9 =10
		x[3] = x[3]- x[6];// x[3]=19 -10 = 9

		System.out.println("final array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
	}
}
