/*
19. Find out the avg value from a first half of given int array? 
*/
class  S
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9};
		int sum=0;
		for(int i=0;i<x.length/2;i++)
		{
			sum+=x[i];
		}

		double avg=sum/(x.length/2);
		

		System.out.println("average in the 1st half :"+avg);
	}
}