//Bubble Sort
import java.util.Arrays;
class  A
{
	public static void main(String[] args) 
	{
		int x[]= {5,4,17,8,2,15,56,88,4,6,4,5,10};
		System.out.println(Arrays.toString(x));

		for(int i=0;i<x.length;i++)
			{
					for(int j=0;j<x.length-1-i;j++)
						{
							if(x[j]>x[j+1])
							{
							 int temp=x[j];
							 x[j]=x[j+1];
							 x[j+1]=temp;
							}

						}

			}
		System.out.println(Arrays.toString(x));

	}
}
