class F
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=10;
		while(i>=5)
		{
			System.out.println("body begin:"+ i);
			i--;
			if(i<=6)
			{
				continue;//leave the iteration go to the next iteration
			}
			System.out.println("body end:"+ i);		
		}
		System.out.println("main End :" +i);
	}
}