class A extends Thread
{
	public void run()
	{
		System.out.println("run begin");
		for(int i =1; i<200; i++)
		{
			System.out.println(i);
		}
		System.out.println("run end");
	}
}
class M58 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("a:" +a1.getState());
		a1.start();
		System.out.println("b:" +a1.getState());
		Util.sleep(1);
		System.out.println("c:" +a1.getState());
		Util.sleep(1000);
		System.out.println("d:" +a1.getState());
	}
}


/*

-before calling start(), state will be New
once start() is calling it is Runnable as long as it is running


By default every Thread three state

once run() got over Terminated.




*/