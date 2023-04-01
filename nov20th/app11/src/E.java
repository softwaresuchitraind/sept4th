//5.find the 2nd maximum element from the given array
class  E
{
	public static void main(String[] args) 
	{
		//int []x={100,4,8,20,6,11,15};
		int []x={1,4,8,20,6,3,11,15};
		//int []x={10,4,8,20,6,11,2,15};
		int max1=x[0],max2=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max1)
			{
				max2=max1;
				max1=x[i];
			}
			else if(x[i]>max2)
			{
				max2=x[i];
			}
		
			else if (max1==max2 && x[i]<max2)
			{
				max2=x[i];
			}
		}
		System.out.println("max2 : " +max2);
	}
}
