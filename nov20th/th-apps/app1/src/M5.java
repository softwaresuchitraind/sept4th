class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println("from child: " +i);
		}
	}
}
class M5 
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		Thread t1 =new Thread(a1);
		t1.start();
		for(int i=300;i<500;i++)
		{
			System.out.println("from main: " +i);
		}
	}
}
/*
2nd way of creating thrd
impliemenyting Runnable

Runnable is a interface available in java.lang package.

inside Runnable only one method i.e run()

-while creating an object to a new thread is not creating.
-create an object to Thread/subclass to thread
-cheld thred is created
-this child that has not threadness feature.
-we are supplying runnable as argument.
-a.start()
--------
registing the thread scedular
it is internally calling a1.run()
-u can not call a1.start() as no start() in Runnable.

-Runnable,Comparable,Comparator having only one method is called
functional interface.




*/