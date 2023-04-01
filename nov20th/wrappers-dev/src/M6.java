class M6 
{
	public static void main(String[] args) 
	{
		String s1 = "10.5";
		Double obj1 = new Double(s1);
		Double obj2= Double.valueOf(s1);
		double d1 = obj1.doubleValue();
		double d2 = obj2.doubleValue();
		System.out.println("done");
	}
}
