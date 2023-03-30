//Q48. Find out sum of the digits of a given number in a single digit?
//123 -> 6
//67 ->13 ->4
//869 -> 24 -> 6
class Q48
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("enter 1 command line args");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int i = num;
		while(i / 10 != 0)
		{
			int j = i;
			int sum = 0;
			while(j != 0)
			{
				sum = sum + j % 10;
				j = j / 10;
			}
			System.out.println("num : "+ i + " and digits sum: "+ sum);
			i = sum;
		}
		System.out.println("final sum:" + i);
	}
}
