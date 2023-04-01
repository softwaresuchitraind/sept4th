//Swap two int variables without 3rd variable
class Swap 
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("Enter 2 cla");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + ","+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println(num1+ ","+num2);
	}
}
