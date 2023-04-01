class M48
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

/*
abcabcabc
9
16

-length() is total number of characters
-capacity() is buffer size.

*/