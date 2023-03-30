class M19
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread t1=new Thread(
			()->{
			
			System.out.println("child begin");
			Util.sleep(10000);
			System.out.println("child end");
			});

			t1.start();
			Util.sleep(2000);
			t1.interrupt();//whenever Thread is sleep it can be interrupted
			System.out.println("main end");
		
	}
}
/*
After 2secs itself we are interrupting
becaue of interrrupt child is executing for 2sec ---if somebody interrupting it is coming away from sleep.
when ever thread is sleeping thread can interrupt, it is no longer sleep
*/