//Perfect Number
class I
{
	public static void main(String[] args) 
	{
		if(args.length<1)
		{
			System.out.println("plz supply one cla");
			return;
		}
		int num=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1;i<num/2;i++)
		 {
			if(num%i==0)
			 {
				sum+=i;
			 }
		
		 }
		if(num==sum)
		{   
			System.out.println(num+ "is Perfect");
		}
		else
		{
	    System.out.println(num+ "is not an Perfect");

		}
		
   }
}

//sum of divisiables of a particular number
//28 & 6