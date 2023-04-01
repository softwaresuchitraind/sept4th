import java.util.Properties;
class GenericThread extends Thread 
{
	public void run()
	{
		while(true)
		{
			//1. going to wait
			synchronized(this)
			{
				try
				{
					wait();
				}
				catch (InterruptedException ex)
				{
				}
			}
			//2. main task
			//Properties pr = System.getProperties();
			//pr.list(System.out);

			for(int i =1; i < 5; i++)
			{
				System.out.println(getName() + ":" +i);
				Util.sleep(100);
			}
			Util.sleep(1000);
			
			//3. sending a notification		
			synchronized(this)
			{
				notify();
			}
			
		}

	}
	
}

/*
-pool of threads are storing in a container is called Thread pool.



creating multiple threads and maintaining in a container is 
nothing but Thread Pool.


if multiple customer require multiple Generic Threads........


if Generic Task is not varying from one customer to another customer
then same
Generic Thread can be served for multiple customer.

reusable

-In order to address simultaneous customers we require a pool of Generic Threads

reusing the same Thread for multiple customers.


pool Concept--Pool main operations


*/
