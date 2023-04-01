package com.lara;

import java.util.concurrent.ArrayBlockingQueue;

public class P 
{
	public static void main(String[] args) 
	{
		ArrayBlockingQueue<Integer> abq =
			new ArrayBlockingQueue<Integer>(10);
		produceElements(abq);
		consumeElements(abq);
	}
	private static void produceElements(final ArrayBlockingQueue<Integer> abq)
	{
		new Thread()
		{
			@Override
			public void run()
			{
				int i = 0;
				while(true)
				{
					try
					{
						abq.put(123);
						System.out.println("element produced");
						if(i< 10)
						{
							
						}
					}
					catch ()
					{
					}
				}
			}
		}
	}
}


/*
ArrayBlockingQueue

-producer storing elemnts in the Queue and consumer will removing elments from queue

interthread communication
-once producer procduces if no space ----go to waiting state
-consumer consumes if no space----go to waiting state
*/
