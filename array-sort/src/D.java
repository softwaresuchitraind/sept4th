import java.util.Arrays;
//Quicksort
class D 
{
	public static void main(String[] args) 
	{
		int [] x={10,2,25,3,15,6,18,12,20,4,1,22,14,8,24};
		System.out.println(Arrays.toString(x));
		int low=0;
		int high=x.length-1;
		quickSort(x,low,high);
		System.out.println(Arrays.toString(x));
	}
	public static void quickSort(int []arr,int low,int high)
	{
		if(arr.length==0)
		{
			return;
		}//1
		if(low>=high)
		{
			return;
		}//2
		//pick the pivot
		int middle= low+(high-low)/2;
		int pivot=arr[middle];
		//make left <pivot and right>pivot
		int i=low,j=high;
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}//3
			while(arr[j]>pivot)
			{
				j--;
			}//4
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}//5
		}
	
	if(low<j)
		{
			quickSort(arr,low,j);
		}//6
	if(high>i)
		{
			quickSort(arr,i,high);
		}//7
	}
}
