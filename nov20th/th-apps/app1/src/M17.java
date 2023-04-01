class M17
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("daemon:"+t1.isDaemon());
		t1.setDaemon(true);
		System.out.println("daemon:"+t1.isDaemon());
	
	}
}
/*

main thread by default is user.
Exception
once thread is started we can not convert into daemon.
-Once thread is started u can not change its Daemon status.
-Any thread daemon status can be chnaged before starting.



RE
daemon:false
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.setDaemon(Thread.java:1359)
        at M17.main(M17.java:7)



-Main Thread is alreay started, so it can not be converted into daemon.


*/