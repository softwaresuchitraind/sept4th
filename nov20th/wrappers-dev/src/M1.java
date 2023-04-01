class M1 
{
	public static void main(String[] args) 
	{
		int i =10;
		Integer obj1 = new Integer(i);
		Integer obj2 = Integer.valueOf(i);
		int j = obj1.intValue();
		int k = obj2.intValue();
		System.out.println("done");
	}
}
