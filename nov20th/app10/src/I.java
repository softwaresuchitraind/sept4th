class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		myFirstLoop:
		do
		{
			
			System.out.println("loop body begin:"+i);
			if(i>=5)
			{
				i++;
				continue myFirstLoop;
			}
			System.out.println("loop body end:"+i);
			i++;
		
		}
		while (i<=10);
		System.out.println("main end");
	}
}
/*
increment or decrement should happen before continue
*/