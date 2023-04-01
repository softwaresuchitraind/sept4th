class E
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=10;
		while(i>=5)
		{
			System.out.println("body:"+ i);
			i--;
			int j=20;//j should not be used outside
			
		}
		System.out.println("main End :" +i+ ","+j);
	}
}