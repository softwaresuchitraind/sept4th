//6.Find the average value of the int array
class F 
{
	public static void main(String[] args) 
	{
		int[] x={100,4,8,20,6,11,15};
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum+=x[i];
		}
		double avg = (double)sum/x.length;
		System.out.println("avg :"+avg);
	}
}
