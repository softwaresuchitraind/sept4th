// fibonacci series till to 10000 without using loop
class Fibonacii  
{
	public static void main(String[] args) 
	{
		int m =0, n =1;
		System.out.println(m+ " " +n);
		fibonacii(m,n);
	}
	public static void fibonacii(int m,int n)
	{
		if(n < 10000)
		{
			int s = m+n;
			m=n;
			n=s;
			System.out.println(""+s);
			fibonacii(m,n);
		}
	}
}
