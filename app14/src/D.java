//How to find total digit in a given number
class D
{
	public static void main(String[] args) 
	{
		if(args.length<1)
		{
			System.out.println("plz supply one cla");
			return;
		}
		int num=Integer.parseInt(args[0]);
		int count=0;
		int i=num;
		while(i != 0)
		{
		 i=i/10;
		 count++;
		}
		System.out.println("digits Count in:"+num+ "is" +count);
	}
}
