//How to find sum of every digit in a given number
class E
{
	public static void main(String[] args) 
	{
		if(args.length<1)
		{
			System.out.println("plz supply one cla");
			return;
		}
		int num=Integer.parseInt(args[0]);
		int sum=0,digit=0;
		int i=num;
		while(i != 0)
		{
		 digit=i%10;
		 sum+=digit;
		 i=i/10;
		}
		System.out.println("Sum of all the number:"+num+ "is" +sum);
	}
}
