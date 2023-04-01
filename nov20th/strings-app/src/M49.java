class M49
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
		sb.trimToSize();//it is removing unouupied characters in the Buffer
		System.out.println(sb.capacity());
	}
}