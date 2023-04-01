/* 9.Find out minimum value all even indexed element from the given
int array */
class I
{
	public static void main(String[] args) 
	{
		int[] x={100,4,8,20,6,11,15};
				// 0 1 2 3  4  5  6
		int min =x[0];

		for(int i=2;i<x.length;i=i+2)
		{
			if(x[i]<min)
			{
				min =x[i];
			}
		}
		
		System.out.println("min :"+min);
	}
}
