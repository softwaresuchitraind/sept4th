class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int []x={10,20,30};
		int i=x[9];
		System.out.println("main End");
	}
}
/*

G:\sept4th\exceptions\app1\src>javac -d ../classes D.java

G:\sept4th\exceptions\app1\src>java -cp ../classes D
main begin
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
        at D.main(D.java:7)

Arry size is 3
*/