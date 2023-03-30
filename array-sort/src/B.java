//Selection sort
import java.util.Arrays;
class	B
{
	public static void main(String[] args) 
	{
		int []a ={3,22,2,1,15};
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++)
		{
		   int index=i;
		   for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
				 index=j; 
				}
		   
		     }
			 int smallerNumber=a[index];
			 a[index]=a[i];
			 a[i]=smallerNumber;

		}
				System.out.println(Arrays.toString(a));

	}

}
