import java.util.Arrays;
class E

{
	public static void main(String[] args) 
	{
		int []x={10,20,30,4,50,6,70};
		System.out.println(Arrays.toString(x));
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
		sum+=x[i];
		}
		System.out.println("sum:"+sum);
		double avg=(double)sum/x.length;
		System.out.println("avg:"+avg);
	}
}
