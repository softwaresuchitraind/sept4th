//Removing Y elements from X array
import java.util.Arrays;
class S
{
	public static void main(String[] args) 
	{
				int []x={10,10,12,30,4,60,7,80};
				int []y={10,30,7,70};
				System.out.println(Arrays.toString(x));
				System.out.println(Arrays.toString(y));
				int size=x.length;
				for(int i=0;i<y.length;i++)
		        {
					for( int j=0;j<size;j++)
					{
					 if(y[i]==x[j])

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
				int [] z=new int[size];
				for(int i=0;i<size;i++)
				{
				    z[i]=x[i];
				}
				System.out.println(Arrays.toString(x));
				System.out.println(Arrays.toString(y));
				System.out.println(Arrays.toString(z));
				
}
}