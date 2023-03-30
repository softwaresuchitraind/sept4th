class M6
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		t1.setName("initiator");
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
	}
}