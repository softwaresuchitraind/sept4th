class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 =null;
		int i =s1.length();
		System.out.println("Main End");
	}
}
/*
G:\nov20th\exception\app1\src>java -cp ../classes B
main begin
Exception in thread "main" java.lang.NullPointerException
        at B.main(B.java:7
*/