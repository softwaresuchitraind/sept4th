class M17
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread t1=new Thread(
			()->{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child:"+ i);
			Util.sleep(1000);//do not require a try catch here
		}
		});

		t1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main:"+ i);
			Util.sleep(20000);
		}
		System.out.println("main end");
		
	}
}
/*
if multiple threads are sleeping developing the util class is very adviseable.
*/