/*
13. Find out the sum of all elements from a first half
of given int array? 
*/
class  M1
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,2,4,6,9};

		//middle is in second half

		int sum=0;
		for(int i=0;i<(x.length/2);i++)
		{
			sum+=x[i];
		}
		System.out.println("sum :"+sum);
	}
}
