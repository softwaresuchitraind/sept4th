class M12 
{
	public static void main(String[] args) 
	{
		Integer obj1 = new Integer(909090);
		Integer obj2 = new Integer(909090);
		System.out.println(obj1.equals(obj2));
		Boolean obj3 = new Boolean(false);
		Boolean obj4 = new Boolean(false);
		System.out.println(obj3.equals(obj4));
	}
}

/*

in every wrapper class equals() method got overided 
checking the content
true
true

*/
