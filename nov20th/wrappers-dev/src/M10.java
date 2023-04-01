class M10 
{
	public static void main(String[] args) 
	{
		String s1 = "10r";
		int i = Integer.parseInt(s1);
		System.out.println("done");
	}
}
/*

G:\nov20th\wrappers-dev\src>javac -d ../classes M10.java

G:\nov20th\wrappers-dev\src>java -cp ../classes M10
Exception in thread "main" java.lang.NumberFormatException: For input string: "10r"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at M10.main(M10.java:6)
*/
