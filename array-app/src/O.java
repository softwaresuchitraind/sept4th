//Right rotate by one
import java.util.Arrays;
class O
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
			    int temp=x[x.length-1];
				for(int i=x.length-1;i>0;i--)
	
		    {
				x[i]=x[i-1];
			}
			x[0]=temp;
			System.out.println(Arrays.toString(x));
		

	}
}