class M57 
{
	public static void main(String[] args) 
	{
		Thread.State[] states = Thread.State.values();
		for(Thread.State state :states)
		{
			System.out.println(state);
		}
	}
}
/*
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED

-Fixed number of states available.
-Every thread has to go these states
-State is enum inside a Thread class,
all the constants of enum through values()

*/