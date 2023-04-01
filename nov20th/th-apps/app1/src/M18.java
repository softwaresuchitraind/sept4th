class M18
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("Priority:"+t1.getPriority());
		t1.setPriority(10);
		System.out.println("Priority:"+t1.getPriority());
	
	}
}
   
/*
Priority:5
Priority:10
-Every thread has priority.main thread is having priority.default priority is 5
we can change priotity.priority is a integer number between 1 to 10.
1-minimum
5-normal
10-maximum priority
-we should not set any priority lesser than 1 and greater than 10.

What is priority ?

Thread shedular will allocate more number of milliseconds to having more priority.
try to provide more number of milliseconds.
*/