class A implements Runnable
{
	public void run()
	{
		//content of child thread
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class  M1
{
	public static void main(String[] args) 
	{
		A a1=new A();//while creating a object thread is not creating as A is not subclass to A--only object to A is creating
		//create a object to thread----child thread
		Thread t1=new Thread(a1);//Thread class constructor which is taking runnable interface
		t1.start();//it is internally calling a1.run()
		//After child thread main thread is continung
		for(int i=1000;i<2000;i++)
		{
		System.out.println(i);
		}
	}
}
/*
Runnable is a interface available in Java.lang package.
In the runnable interface only one method i.e run();
single method interfaces are also called as functional interface.
runnable is one of the functional interface.

is-a relation-------thread class--- 1st way
has-a relation------Runnable-----------2nd way



*/