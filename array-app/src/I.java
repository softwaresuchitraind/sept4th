import java.util.Arrays;
class I
{
	public static void main(String[] args) 
	{
				int []x={10,20,30,4,50,6,70};
				System.out.println(Arrays.toString(x));
				System.out.println("Even indexed elemet :");
	
			for(int i=0;i<x.length;i+=2)
		{
			System.out.print(x[i]+ ",");
			}
			System.out.println();
			System.out.println("Odd indexed elemet :");
	
			for(int i=1;i<x.length;i+=2)
		{
			System.out.print(x[i]+ ",");
			}

	}
}
