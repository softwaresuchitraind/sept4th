
/* 
12. Find out the avg value from all odd indexed elements 
from a given int array? 

*/

class L 
{
	public static void main(String[] args) 
	{
		int []x={100,4,8,20,6,11,15};
				// 0  1 2 3 4 5  6
		//int []x={100,4,8,20,6,11,15,45};
		int sum=0;
		for(int i=1;i<x.length;i=i+2)
		{
			sum+=x[i];
		}
		
		double avg=(double)sum/(x.length/2);
		System.out.println("avg : " +avg);
	}
}
 


