class A extends Thread
{
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(i);
		}
	}
}
class M4 
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		a1.run();
		for(int i=200;i<400;i++)
		{
			System.out.println(i);
		}
	}
}

/*
insted of calling start(),if we call run () what happens

chied thread not getting threadness feature.
single threaded output even though two threads are involved

-without start() method thread schedular will not knowing about
newly created thread...it will not getting processor time....sequential flow-
-single threaded output.


*/