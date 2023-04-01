class M30 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		char[] x = s1.toCharArray();
		for(int i =0; i<x.length/2;i++)
		{
			char temp = x[i];
			x[i] = x[x.length-1-i];
			x[x.length-1-i] = temp;
		}
		String s2 = new String(x);
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*
Reversing content of the string object
*/