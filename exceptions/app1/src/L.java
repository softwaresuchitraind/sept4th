class L 
{
	public static void main(String[] args) 
	{
		System.out.println(" Main begin");
		K.x=20;
		System.out.println(" Main end");
	}
}

/*
NoSuchfield Error


G:\sept4th\exceptions\app1\src>java -cp ../classes L----------if not commenting
 Main begin
 Main end

G:\sept4th\exceptions\app1\src>javac -d ../classes K.java

G:\sept4th\exceptions\app1\src>java -cp ../classes L
 Main begin
Exception in thread "main" java.lang.NoSuchFieldError: x
        at L.main(L.java:6)
*/