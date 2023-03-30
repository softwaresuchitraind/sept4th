import java.util.Arrays;
class C 
{
	public static void main(String[] args) 
	{
		int[] x= {10,2,25,3,15,6,18,12,20,4,1,22,14,8,24};
		System.out.println(Arrays.toString(x));
		int low=0;
		int high=x.length-1;
		quickSort(x,low,high);
		System.out.println(Arrays.toString(x));
	}
	public static void quickSort(int[] arr,int low,int high)

	{
		if(arr==null||arr.length==0)
		{
			return;
		}//1
		if(low>=high)
	
	}
}
