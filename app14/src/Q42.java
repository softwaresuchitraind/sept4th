//Find out all Armstrong numbers between 2 given numbers ?
class Q42 
{
	public static void main(String[] args) 
	{
		int num1 = Integer.pareseInt(args[0]);
		int num1 = Integer.pareseInt(args[1]);
		int currentNum = num1;
		while(currentNum < num2)
		{
			int i = currentNum, j = currentNum;
			int count = 0;
			while(i != 0)
			{
				i = i / 10;
				count++;
			}
			int sum = 0, digit, digitPowerValue = 1;
			while(j != 0)
			{
				digit = j % 10;
				digitPowerValue = 1;
				for(int k = 1; k <= count; k++)
				{
					digitPowerValue = digitPowerValue * digit;
				}
				sum += digitPowerValue;
				j = j/10;
			}
			if(currentNum == sum)
			{
				System.out.println(currentNum + "is an armstrong number");
			}
			currentNum ++;
		}
	}
}
