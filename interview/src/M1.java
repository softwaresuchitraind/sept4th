/*
Find Subarray with given sum

example
given array[]={2,4,20,6,10,5}
given sum= 30

And:(1,3)
Explanation->arr[1]+arr[2]+arr[3]
*/
class M1 
{
	public static void main(String[] args) 
	{
		int arr[] = {2,4,20,6,10,5};
		int n = arr.length;
		int sum = 30;
		M1 subarray = new M1();
		subarray.sumSubArray(arr, n,sum);
	}

	int sumSubArray(int arr[],int n,int sum)
	{
		int curr_sum,i,j,p;
		for(i=0; i<n;i++)
		{
			//pick a starting point
			curr_sum= arr[i];

			for(j=i+1;j<=n;j++)
			{
				if(curr_sum==sum)
				{
					p= j-1;
				System.out.println("Sum found between indexes" +i+ "and" +p);
				return 1;
				}
				if(curr_sum >sum || (j==n))
					break;
				curr_sum = curr_sum+arr[i];
			}
			
		}
		System.out.println("No array found");
		return 0;
	}
}
