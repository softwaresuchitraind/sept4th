/*
20. Find out the avg value from a second half of given int array? 
*/
class T
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9};
		int sum=0;
		for(int i=(x.length/2);i<x.length;i++)
		{
			sum+=x[i];
		}

		double avg=sum/(x.length/2);
		

		System.out.println("average in the 1st half :"+avg);
	}
}