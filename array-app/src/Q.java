//Left rotate by 1
import java.util.Arrays;
class Q
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
				int temp=x[0];
			    
				for(int i=0;i<x.length-1;i++)
	
		    {
				x[i]=x[i+1];
			}
			x[x.length-1]=temp;
			System.out.println(Arrays.toString(x));
		

	}
}