/*
31. Reverse only first half of the elements of given array?
*/
class Z5
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

		int end = (x.length/2);

		for(int i=0;i<end/2;i++)
		{
			
			x[i] = x[i] + x[end-i-1];
			x[end-i-1]= x[i]- x[end-i-1];
			x[i] = x[i]- x[end-i-1];
		}

		System.out.println("final array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
	}
}
