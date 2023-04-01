class M35 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

/*

false
true
- whenever string is created using new operator--a new object is created in nonconstant pool
- equals() method of string checks the content not checking memory location


*/
