/*
1-Read and print 1st element
2-Read and print last element
3-Read and print middle element
4-Read and print minimum element
5-Read and print maximum element
6-Sum of all element
7-Average value of all element
*/
import java.util.Arrays;
class H 
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
				System.out.println("First Element :"+x[0]);
				System.out.println("Last Element:"+x[x.length-1]);
				System.out.println("Middle Element :"+x[x.length/2]);

				int min=x[0],max=x[0],sum=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<min)

			{
			min=x[i];
			}

			if (x[i]>max)
			{
			max=x[i];
			}
		sum+=x[i];
		}

			double avg=(double)sum/x.length;
			System.out.println("Max:"+max);
			System.out.println("Min:"+min);
			System.out.println("Sum:"+sum);
			System.out.println("avg:"+avg);


	}
}
