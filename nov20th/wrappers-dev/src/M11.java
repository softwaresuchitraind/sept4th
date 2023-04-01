class M11 
{
	public static void main(String[] args) 
	{
		String s1 = "10.5";
		int i =Integer.parseInt(s1);
		System.out.println("done");
	}
}
/*
. is not allowed int ,byte,short,long
. is allowed in float and souble.

G:\nov20th\wrappers-dev\src>java -cp ../classes M11
Exception in thread "main" java.lang.NumberFormatException: For input string: "10.5"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at M11.main(M11.java:6)
*/
