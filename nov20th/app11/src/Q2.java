/*
17. Find out the max value from a first half 
	of given int array? 
*/
class  Q2
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12};
		int max= x[0];
		for(int i=1;i<x.length/2;i++)
		{
			if(x[i]>max)
			{
				max =x[i];
			}
		}
		System.out.println("maximum in the 1st half :"+max);
	}
}
