class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(Thread.currentThread().getName() +":" +i);
		}
	}
}
class M7 
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		t1.start();
		t2.start();
		for(int i=400;i<600;i++)
		{
			//to know which thread is running
			System.out.println(Thread.currentThread().getName() + ":" +i);
		}
	}
}
/*
Two child thred is creating

Thread schedular--3theads
*/