//Removing duplicates from array IMP
import java.util.Arrays;
class R
{
	public static void main(String[] args) 
	{
				int []x={10,10,30,4,10,6,4,4,50,30,30,6,6,6};
				System.out.println(Arrays.toString(x));
				int size=x.length;
				for(int i=0;i<x.length;i++)
		     {
				for(int j=i+1;j<size;j++)
				 {
				 if (x[i]==x[j])
				 {
					for(int k=j;k<size-1;k++)
					 {
					
						x[k]=x[k+1];					
					}
					j--;
					size--;

				 }
				}
			 }

			System.out.println(Arrays.toString(x));
		  int []y=new int[size];
		  for(int i=0;i<size;i++)
		{
		y[i]=x[i];
		}
		System.out.println(Arrays.toString(y));
	}
}


//you can not remove arrysize