//49. Assume given numbers containing even number of digits.
// Reverse only 2nd half of the number
class Q49
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("enter 1 command line args");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int i = num, j = num;

		//finding out total number of digits
		int digitsCount = 0;
		while(i != 0)
		System.out.println("final sum:" + i);
	}
}
