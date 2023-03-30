// Reversing a number
class F
{
	public static void main(String[] args) 
	{
		if(args.length<1)
		{
			System.out.println("plz supply one cla");
			return;
		}
		int num=Integer.parseInt(args[0]);
		int revNum=0,digit=0;
		int i=num;
		while(i != 0)
		{
		 digit=i%10;
		 revNum=revNum*10+digit;
		 i=i/10;
		}
		System.out.println("Reverse of:"+num+ "is" +revNum);
	}
}