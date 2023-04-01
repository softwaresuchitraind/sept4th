/*
28. Find out an index of a specified element from a given array? 
*/
class Z2
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12};
		int element =10;
		int index =-1;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==10)
			{
				index=i;
				break;
			}
		}
		if(index != -1)
		{
			System.out.println(element + "is available @ "+ index);
		}
		else
		{
			System.out.println(element + "is not available");
		}
	}
}
