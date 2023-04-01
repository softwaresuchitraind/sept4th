//print initial 100 prime numbers without any loop
//print 100 prime numbers without using any loop
class PrimeNumbers 
{
	static int count = 1;
	static void printPrimeNumbers(int num)
	{
		if (count == 100)
		{
			return;
		}
		if(isPrime(num,2))
		{
			System.out.print(num+ ",");
			count++;
		}
		printPrimeNumbers(++num);
	}
	static boolean isPrime(int n, int i)
	{
		if(n <= 2)
		{
			return (n ==2) ? true : false;
		}
		if(n%i == 0)
		{
			return false;
		}
		if(i*i>n)
		{
			return true;	
		}
		return isPrime(n, i+1);
	}
	public static void main(String[] args) 
	{
		printPrimeNumbers(2);
	}
}
