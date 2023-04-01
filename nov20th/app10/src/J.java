class J
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
				break;
			}
			System.out.println("loop body end:"+i);
			i++;
		
		}
		while (i<=10);
		System.out.println("main end");
	}
}
/*
whenever loop is nesting lavel is required or else not required.
*/