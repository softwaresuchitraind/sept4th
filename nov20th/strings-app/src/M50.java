class M50
{
	public static void main(String[] args) 
	{
		//initial is 16 we can increase
		StringBuffer sb = new StringBuffer(500);
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