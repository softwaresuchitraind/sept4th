//Sum of all digits without using loop
class Q2 
{
	static int sumOfDigits(int num)
	{
		if(num==0)
		{
			return 0;
		}
		return(num % 10 + sumOfDigits(num/10));
	}
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("enter cla");
		}
		int digit = Integer.parseInt(args[0]);
		System.out.println(sumOfDigits(digit));
	}
}
