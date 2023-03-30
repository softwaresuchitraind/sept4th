//Left shift by one
import java.util.Arrays;
class P
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
			    
				for(int i=0;i<x.length-1;i++)
	
		    {
				x[i]=x[i+1];
			}
			
			System.out.println(Arrays.toString(x));
		

	}
}