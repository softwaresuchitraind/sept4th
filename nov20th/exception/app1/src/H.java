class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int [] x = new int[999999999];
		System.out.println("main end");
	}
}
//if heap memory is not sufficient --OutofMemoryError

/*
G:\nov20th\exception\app1\src>java -cp ../classes H
main begin
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at H.main(H.java:6)
*/