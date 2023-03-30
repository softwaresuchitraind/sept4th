//Selection Sort
import java.util.Arrays;
public class A
{
  	public static void main(String[] args) 
	{
		int[] arr={3,22,2,1,15,7,11,4,6,5};
/*
i=0
{1,22,2,3,15,7,11,4,6,5};
i=1
{1,2,22,3,15,7,11,4,6,5};
i=3
{1,2,3,22,15,7,11,4,6,5};
*/
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			int index =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
				index=j;
				}
			}
			int smallerNumber =arr[index];
			arr[index]=arr[i];
			arr[i]=smallerNumber;
	     }
	  System.out.println(Arrays.toString(arr));
    }
}
/*
Selection sort
identify the smaller element and swapping with other element.
*/