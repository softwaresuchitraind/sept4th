class M42 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		System.out.println(s1);
		s1.concat("hello");
		System.out.println(s1);
	}
}

/*
abc
abc

-a new string is created abchello---unfortunately that new String is not refered to s1.
*/
