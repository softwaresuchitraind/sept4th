class M18
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread t1=new Thread(
			()->{
			
			System.out.println("child begin");
			Util.sleep(1000);
			System.out.println("child end");
			});

			t1.start();
			Util.sleep(2000);
			System.out.println("main end");
		
	}
}
/*
child sleep for 10secs main is sleep only for 2secs
*/