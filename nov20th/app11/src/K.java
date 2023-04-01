/* 
11. Find out the avg value from all even indexed elements from
a given int array? 

*/

class K  
{
	public static void main(String[] args) 
	{
		int []x={100,4,8,20,6,11,15};
		//int []x={100,4,8,20,6,11,15,45};
		int sum=0;
		for(int i=0;i<x.length;i=i+2)
		{
			sum+=x[i];
		}
		int count=
			(x.length %2==0 ? x.length/2 :((x.length/2)+1));
		double avg=(double)sum/count;
		System.out.println("avg : " +avg);
	}
}
