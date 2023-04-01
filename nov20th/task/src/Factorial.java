class Factorial 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("Enter Cla");
		}
		int num = Integer.parseInt(args[0]);
		int FactorialNum = fact(num);
		System.out.println("Factorial num: "+FactorialNum);
	}
	static int fact(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		return(num*fact(num-1));
	}
}
