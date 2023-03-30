class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		main(args);
		System.out.println("main End");
	}
}

/*

no break--entire stack memory filling in main.
there is always condition based recursion



main begin
main begin
Exception in thread "main" java.lang.StackOverflowError
        at java.io.FileOutputStream.write(FileOutputStream.java:326)
        at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
        at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)

StackOverFlowError

-Error Object also rising if not handeled

*/