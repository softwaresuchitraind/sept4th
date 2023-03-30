//41. Find out initial 3 Armstrong numbers(consider from 11)
class Q41
{
	public static void main(String[] args) 
	{
		int num = 11;
		int armstrongCount = 0;
		while(armstrongCount < 3)
		{
			int i = num, j = num;
			int count = 0;
			while( i != 0)
			{
				i = i/10;
				count++;
			}
			int sum = 0, digit, digitPowerValue = 1;
			while( j != 0)
			{
				digit = j % 10;
				digitPowerValue = 1;
				for(int k = 1; k <= count; k ++)
				{
					digitPowerValue = digitPowerValue * digit;
				}
				sum += digitPowerValue;
				j = j / 10;
			}
			if(num == sum)
			{
				System.out.println(num + "is an armstrong number");
				armstrongCount ++;
			}
			num ++;
		}
		
   }
}
//153 is amstrong number---power of total number of digits=number