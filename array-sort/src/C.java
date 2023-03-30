// INSERTION SORT
import java.util.Arrays;
class C 
{
	public static void main(String[] args) 
	{
		int a[]={3,5,7,56,43,80,5,3,2,46};
		System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
				 int temp=a[j];
				 a[j]=a[j-1];
				 a[j-1]=temp;
				}
			}
		
		}
	System.out.println(Arrays.toString(a));

	}
}
