class M19
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("Priority:"+t1.getPriority());
		t1.setPriority(11);
		System.out.println("Priority:"+t1.getPriority());
	
	}
}
/*

G:\nov20th\th-apps\app1\src>javac -d ../classes M19.java

G:\nov20th\th-apps\app1\src>java -cp ../classes M19
Priority:5
Exception in thread "main" java.lang.IllegalArgumentException
        at java.lang.Thread.setPriority(Thread.java:1089)
        at M19.main(M19.java:7)



- as priortiy set to 11.u should setPriority as 1 to 10 only.
*/