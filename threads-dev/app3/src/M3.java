//using anonymos inner class
class M3
 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class--subclass to Runnable interface
		Runnable r1=new Runnable()//designing a subclass to Runnable interface
		{
			//only one method which is abstract no need for other class
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println("run:"+i);
				}
			}
		};
		//can create any number of threads
		Thread t1=new Thread(r1);
		t1.start();//internally calling r1.run()
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
		
	}
}
