class A extends Thread
{
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(getName() + ":" +i);
		}
	}
}
class M6 
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		A a2 =new A();
		a1.start();
		a2.start();
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