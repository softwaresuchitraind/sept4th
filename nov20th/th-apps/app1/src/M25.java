class A extends Thread 
{
	public void run()
	{
		for(int i=1; i<2000;i++)
		{
			System.out.println("child :" +i);
		}
	}
}
class M25
{
	public static void main(String[] args) 
	{
		
		A a1 = new A();
		a1.start();
		System.out.println("main end");
	}
}
/*
which Thread executing 1st ?
-child thred is user thread.
-user thread is not depending on its parent.
-even parent left for execution user continue execution.
*/