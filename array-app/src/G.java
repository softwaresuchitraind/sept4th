import java.util.Arrays;
class G

{
	public static void main(String[] args) 
	{
		int []x={10,20,30,4,50,6,70};
		System.out.println(Arrays.toString(x));
		
		//finding maximum element
		int max= x[0];
		for(int i=1;i<x.length;i++)
		{
		if(x[i]>max)

			{
			max=x[i];
			}

			
		}
           System.out.println("maimum :"+max);
	}
}
