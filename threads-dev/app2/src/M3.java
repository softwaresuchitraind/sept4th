class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println(i);
		}
	}
}
class M3 
{
	public static void main(String[] args) 
	{
		A a1=new A();//one thread is created as A is subclass to A
		a1.start();//is also inherited to thread class
		for(int i=2000;i<=3000;i++)
		{
			System.out.println(i);
		}
	}
}
/*
There are two ways of developing multithreading
some iteration for one for loop and other for another loop.
thread class is available inside java.lang package.
it is aconcrete class containg class.
run() inheriting from thread class we are overiding.
start() inherited form Thread class to class A.

*/