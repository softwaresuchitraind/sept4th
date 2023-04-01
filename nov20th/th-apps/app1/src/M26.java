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
class M26
{
	public static void main(String[] args) 
	{
		
		A a1 = new A();
		a1.setDaemon(true);
		a1.start();
		System.out.println("main end");
	}
}
/*
-Deamon condition should be before start.
-Daemon always depend on its parent -
-if parent is on execution deamon is also under execution
Before staring we can change daemon status.
main method daemon status can not be changed as 
it is started by jvm
*/