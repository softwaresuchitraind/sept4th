class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		myFirstLoop:
		do
		{
			
			System.out.println("loop body begin:"+i);
			myInnerLoop:

			for(int j=10;j<=12;j++)
			{
				System.out.println("inner loop body begin"+i+","+j);
				if(j==11)
				{
					continue myFirstLoop;
				}
				System.out.println("inner loop body end"+i+","+j);
			}
			System.out.println("loop body end:"+i);
			
		
		}
		while (i++<=10);
		System.out.println("main end");
	}
}
/*

*/