class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		K.x = 20;
		System.out.println("main end");
	}
}
/*

G:\nov20th\exception\app1\src>javac -d ../classes L.java

G:\nov20th\exception\app1\src>java -cp ../classes L
main begin
main end

//commnet
G:\nov20th\exception\app1\src>javac -d ../classes K.java

G:\nov20th\exception\app1\src>java -cp ../classes L
main begin
Exception in thread "main" java.lang.NoSuchFieldError: x
        at L.main(L.java:6)
*/
