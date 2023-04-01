class A extends Thread 
{
	A(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("from child");
		System.out.println("id: "+getId());
		System.out.println("name: "+getName());
		System.out.println("priority: "+getPriority());
		System.out.println("Daemon: "+isDaemon());
	}
}
class M24
{
	public static void main(String[] args) 
	{
		
		A a1 = new A("frist chield Thread");
		a1.start();
	}
}
/*


from child
id: 9
name: frist chield Thread
priority: 5
Daemon: false


Through constructor we can set name of the Thread.
*/