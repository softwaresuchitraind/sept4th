/*
16. Find out the min value from a second half of given int array?
*/
class  P2
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,0,4,6,9,1};
		
		int min=x[(x.length/2)];
		for(int i=(x.length/2)+1;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min =x[i];
			}
		}
		System.out.println("min in the 2nd half :"+min);
	}
}
