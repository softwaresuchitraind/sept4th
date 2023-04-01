/* 10.Find out maximum value all odd indexed element from the given
int array */
class J
{
	public static void main(String[] args) 
	{
		int[] x={100,4,8,20,6,11,15};
				// 0 1 2 3  4  5  6
		int max =x[1];

		for(int i=3;i<x.length;i=i+2)
		{
			if(x[i]>max)
			{
				max =x[i];
			}
		}
		
		System.out.println("max :"+max);
	}
}
