//2.Find the max element from the given int array?
class C 
{
	public static void main(String[] args) 
	{
		//int []x={10,4,8,20,6,11,15};
		int []x={10,4,8,20,6,11,28,15};
		int max=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		System.out.println("max: "+max);
	}
}
