//38. print immediate next number in the Fibonacii series ?
//consider till to 5000
class Q38
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int newNum;
		System.out.print((num1 + 1) + ", "+ (num2 + 1)+ ", ");
		while((num1 + num2 ) < 5000)
		{
			newNum = num1 + num2;
			System.out.print((newNum + 1) + ", ");
			num1 = num2;
			num2 = newNum;
		}
	}
}
