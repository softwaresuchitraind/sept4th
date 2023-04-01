class M12 
{
	public static void main(String[] args) 
	{
		class A extends Thread
		{
		}
		A a1 = new A();
		Thread t1 = new Thread();
		System.out.println(a1);
		System.out.println(t1);
	}
}
/*
Thread[Thread-0,5,main]
Thread[Thread-1,5,main]
-In Thread class toSting() method got overided

*/