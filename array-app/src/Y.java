//Sorting content of the array
//bubble sort
import java.util.Arrays;
class Y
{
	public static void main(String[] args) 
	{
		
		int[]x={20,4,40,5,50,8,10};
		 System.out.println(Arrays.toString(x));
		 System.out.println(".....................");
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
/*MISSED ELEMENT OF THE GIVEN ARRAY*/