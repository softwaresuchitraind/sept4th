//Finding total number of digits in a given number by using recursion
class Q1 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("plz enter one cla");
			System.exit(0);
		}
		int i = Integer.parseInt(args[0]);
		int j = countDigits(i);
		System.out.println("number of digits in" +i+ "is" +j);
	}
	static int countDigits(int num)
	{
		if(num ==0)
		{
			return 0 ;
		}
			return 1 + countDigits(num/10);
	}
}
