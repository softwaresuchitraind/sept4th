/*
18. Find out the max value from a second half of given int array?  
*/
class  R3
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,20};
		int max= x[(x.length/2)];
		for(int i=((x.length/2)+1);i<x.length;i++)
		{
			if(x[i]>max)
			{
				max =x[i];
			}
		}
		System.out.println("maximum in the 1st half :"+max);
	}
}