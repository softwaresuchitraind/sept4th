class H 
{
	public static void main(final String[] args) 
	{
		args[0]="abc";
		System.out.println("done");
	}
}
/*

G:\nov20th\app29\src>javac -d ../classes H.java

G:\nov20th\app29\src>java -cp ../classes H
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at H.main(H.java:5)
*/

