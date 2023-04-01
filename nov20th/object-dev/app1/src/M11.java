class M11 
{
	public static void main(String[] args) 
	{
		String s1 = new String("abc");
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(s1);
		System.out.println(sb1);
		System.out.println(sb2);
	}
}

/*
abc
abc
abc
-In all the three class Object class toString() got overided-
printing the
content of the object rather than memeory address.

*/
