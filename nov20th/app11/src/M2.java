/*
13. Find out the sum of all elements from a first half
of given int array? 
*/
class  M2
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,2,4,6,9,2};
		int sum=0;
		for(int i=0;i<(x.length/2);i++)
		{
			sum+=x[i];
		}
		System.out.println("sum :"+sum);
	}
}
