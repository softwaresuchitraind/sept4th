class M36 
{
	public static void main(String[] args) 
	{
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

/*
false
true
-Totally 3 String objects created here.
This is can not be modified.
*/