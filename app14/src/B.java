/*Fibonesis number between two given series*/
class B
{
	public static void main(String[] args) 
	{
		int i=0,j=1;
		if(args.length<2)
		{
			System.out.println("Pls supply 2 cla");
			return;

		}
		System.out.println("fib series");
		int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		System.out.println("fib series b/w"+m+"and"+n);
		if(m==i&&n>=j)
		{
		System.out.print(i+ ","+j+ ",");
		}
		int k=0;
		while((k=(i+j))<n)
		{
			if(k>=m)
			{
				System.out.print(k+ ",");
			}
			i=j;
			j=k;
		}
	}
}
//fibonesis series from 0 to 100 in reverse order