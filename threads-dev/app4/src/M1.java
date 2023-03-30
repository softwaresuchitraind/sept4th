class M1 
{
	public static void main(String[] args) 
	{
		//whichever  thread is executing that thread is represented in t1
		Thread t1=Thread.currentThread();
		System.out.println(t1);
	}
}
/*
Thread[main,5,main]

main----name of the thread
5--priority
main---parent
for main thread parent is main itself
*/