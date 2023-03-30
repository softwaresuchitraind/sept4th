//print the Amstrong number which is in between two given numbers.If there is no  amstrong number then check 
class C1 
{
	public static void main(String[] args) 
	{
		if(args.length<2)
		{
		System.out.println("Please enter two cla");
		System.exit(0);
		}
		int num1=Integer.parseInt(args[0]);
		int f=num1,g=0;
		int num2=Integer.parseInt(args[1]);
		System.out.println(" Amstrong numbers between"+f+ "and" +num2+  "are");
		//boolean flag=false;
		while(num1<=num2)
		{
		int i=num1,count=0;
		while(i!=0)
		{
			count++;
			i=i/10;
		}
		
		int digits=1,sum=0,last;
		int j=num1;
		while(j!=0)
		{
			last=j%10;
			int digit=1;
			for(int c=1;c<=count;c++)
			{
				 
				digit=digit*last;
			}
			sum+=digit;
			j=j/10;
		}
		
		if(sum==num1)
		{
			System.out.println(num1);
			
		}
		
		num1++;
		
		}
	}
}
