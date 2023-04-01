/*
29. Swap two given indexed elements from the array? 
*/
class Z3
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

		
		int temp = x[3];
		x[3] = x[6];
		x[6] = temp;

		System.out.println("final array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
	}
}
