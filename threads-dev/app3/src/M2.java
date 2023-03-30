class A implements Runnable
{
	public void run()
	{
		
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class  M2
{
	public static void main(String[] args) 
	{
		A a1=new A();
		/*By using one class A of Runnabke type object we can create any number of thread
		-three threads are sharing one object
		-has a relation type
		-every thread is using differnt copies of run()
		
		*/
		Thread t1=new Thread(a1);
		t1.start();
		Thread t2=new Thread(a1);
		t2.start();
		Thread t3=new Thread(a1);
		t3.start();
		for(int i=1000;i<2000;i++)
		{
		System.out.println(i);
		}
	}
}