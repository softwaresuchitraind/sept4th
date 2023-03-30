//reading the content of the array in reverse order
import java.util.Arrays;
class J
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
				System.out.println("Reading array in reverse order");
	
			for(int i=x.length-1;i>=0;i--)
		    {
				System.out.print(x[i]+ ",");
			}
			System.out.println();
			System.out.println(Arrays.toString(x));
	
		

	}
}