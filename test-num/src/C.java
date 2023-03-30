//Amstrong Number
class C
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
		int i=num,j=num;
		while(i != 0)
		{
		 i=i/10;
		 count++;
		}
		int sum=0,value=0,digit=0;
		while(j!=0)
		{
		 digit=j%10;
		 value=1;
		 for(int m=1;m<=count;m++)
			{
				value=value*digit;
		    }
			sum+=value;
			j=j/10;
		}
		if(num==sum)
		{
			System.out.println(num+ "is Amstrong");
		}
		else
		{
	    System.out.println(num+ "is not an Amstrong");

		}
		
   }
}
//153 is amstrong number---power of total number of digits=number