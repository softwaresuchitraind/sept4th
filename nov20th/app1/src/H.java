class H
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=10;
		while(i>=5)
		{
			System.out.println("body begin:"+ i);
			
			if(i<=6)
			{
				break;
			}
			i--;
			System.out.println("body end:"+ i);		
		}
		System.out.println("main End :" +i);
	}
}
/*
break and continue should used only in the body pf the loops
*/