class M20
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("Priority:"+t1.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority:"+t1.getPriority());
	
	}
}
/*

u can specify

Thread.MIN_PRIORITY--1
Thread.MAX_PRIORITY--10
Thread.NORM_PRIORITY--5



Priority:5
Priority:1


*/