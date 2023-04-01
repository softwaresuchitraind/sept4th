class M51
{
	public static void main(String[] args) 
	{
		//initial is 16 we can increase
		StringBuffer sb = new StringBuffer(500);
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	
	}
}