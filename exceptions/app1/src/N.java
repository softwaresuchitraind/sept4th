class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		M obj=new M();
		obj.test();
		System.out.println("main end");
	}
}
/*
G:\sept4th\exceptions\app1\src>javac -d ../classes N.java

G:\sept4th\exceptions\app1\src>java -cp ../classes N
main begin
main end

commet test() of M class

G:\sept4th\exceptions\app1\src>java -cp ../classes N
main begin
Exception in thread "main" java.lang.NoSuchMethodError: M.test()V
        at N.main(N.java:7)


*/