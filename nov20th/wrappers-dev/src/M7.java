class M7
{
	public static void main(String[] args) 
	{
		String s1 = "true";
		Boolean obj1 = new Boolean(s1);
		Boolean obj2= Boolean.valueOf(s1);
		boolean b1 = obj1.booleanValue();
		boolean b2 = obj2.booleanValue();
		System.out.println("done");
	}
}
