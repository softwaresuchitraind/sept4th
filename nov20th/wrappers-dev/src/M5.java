class M5 
{
	public static void main(String[] args) 
	{
		String s1 = "10";
		Integer obj1 = new Integer(s1);
		Integer obj2 = Integer.valueOf(s1);
		int i =obj1.intValue();
		int j =obj2.intValue();
		System.out.println(i);
		System.out.println(j);
	}
}
