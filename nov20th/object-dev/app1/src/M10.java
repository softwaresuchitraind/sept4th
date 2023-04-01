class M10 
{
	public static void main(String[] args) 
	{
		Integer obj1 = new Integer(900000);
		System.out.println(obj1);
		Double obj2 = new Double(900000.9);
		System.out.println(obj2);
	}
}
/*
900000
900000.9

- it is printing content.--in every wrapper class Object class
toString method got
overided we are getting state of the Object not memory address.
*/