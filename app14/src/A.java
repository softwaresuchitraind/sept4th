//Fibonesis series
class A
{
	public static void main(String[] args) 
	{
		int i=0,j=1;
		System.out.println("fib series");
		System.out.print(i+ ","+j+ ",");
		int k=0;
		while(k<5)
		{
			k=i+j;
			System.out.print(k+ ",");
			i=j;
			j=k;
		}
	}
}
/*Fibonesis number between two given series*/