//Swaping two nearest element
import java.util.Arrays;
class M
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
				int temp;
				for(int i=0;i<x.length-1;i+=2)
	
		    {
				temp=x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
			System.out.println(Arrays.toString(x));
		

	}
}





//greakforgreaks