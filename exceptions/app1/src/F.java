class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1="hello";
		String s2=s1.substring(5,10);
		System.out.println("main End");
	}
}
/*
StringIndexoutofBound exception.<0-4>


main begin
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
        at java.lang.String.substring(String.java:1963)
        at F.main(F.java:7)

*/