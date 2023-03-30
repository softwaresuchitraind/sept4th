class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=Integer.parseInt("abc");
		System.out.println("main end");
	}
}

/*
G:\sept4th\exceptions\app1\src>javac -d ../classes C.java

G:\sept4th\exceptions\app1\src>java -cp ../classes C
main begin
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at C.main(C.java:6)

*/