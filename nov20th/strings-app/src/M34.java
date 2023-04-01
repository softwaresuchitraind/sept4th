class M34 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

/*
Wherever Objects are creating that memory is called heap memeory.

heap memory is of 2 types

1-- String constant pool---small portion is allocated to string constants
2--non constant pool---heap area---bigger area

whenever strings are created without a new operator then it creates in constant pool.
--no duplicates will be in the String constant pool.

*/
