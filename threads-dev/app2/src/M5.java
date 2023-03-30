class A extends Thread
{
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1=new A();//one thread is creating A is subclass to A
		a1.start();
		A a2=new A();//one more thread is created
		a2.start();
		A a3=new A();//
		a3.start();
		for(int i=400;i<500;i++)
		{
			System.out.println(i);
		}
	}
}
/*
Inside A class there are several methods overiding only run(),
for every object one new thread is creating
4 threads---one is default main thread and 3 are created
Every thread is using a separate copy of run method ,so starting from beginning.
*/
