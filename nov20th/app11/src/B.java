//2.Find the min element from the given int array?
class B  
{
	public static void main(String[] args) 
	{
		//int []x={10,4,8,20,6,11,15};
		//int []x={10,4,8,20,6,11,2,15};
		int []x={10,4,8,1,20,6,11,2,0,15};
		int min=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		System.out.println("min: "+min);
	}
}
