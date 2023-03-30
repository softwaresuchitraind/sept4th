//Reversing Content of the array
import java.util.Arrays;
class M1
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
				int temp;
				for(int i=0;i<x.length/2;i++)
	
		    {
				temp=x[i];
				x[i]=x[x.length-1-i];
				x[x.length-1-i]=temp;
			}
			System.out.println(Arrays.toString(x));
		

	}
}