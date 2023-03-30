class A extends Thread
{
	public void run()
	{
		for(int i=1;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class M14 
{
	public static void main(String[] args) 
	{
		A a1=new A();//one child thread is created but not started
		a1.run();
		for(int i=4000;i<5000;i++)
		{
			System.out.println(i);

		}
		
	}
}
/*

we are not calling start(),default thread is only going to run(),
child thread is not started.
even though 2 threads are involved.

*/
