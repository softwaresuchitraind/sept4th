class M11
{
	public static void main(String[] args) 
	{
		Thread main=Thread.currentThread();
		main.setPriority(Thread.MIN_PRIORITY);//changing the main Thread priority

		Runnable r1=() -> {
			Thread t1=Thread.currentThread();
			//Thread.MIN_PRIORITY
			//Thread.NORM_PRIORITY
			//Thread.MAX_PRIORITY


			System.out.println(t1.getId());
			System.out.println(t1.getName());
			System.out.println(t1.getPriority());
			System.out.println(t1.isDaemon());
		};

		Thread t1=new Thread(r1,"my first thread");//we can change the order
		//t1.setPriority(10);
		t1.start();
		System.out.println("done");
	}
}