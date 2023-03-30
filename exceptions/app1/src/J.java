class I
{
}  
class J


{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj=new I();
		System.out.println("main end");
	}
}

//No such class found error --remove I.class and run J.class
/*
G:\sept4th\exceptions\app1\src>java -cp ../classes J
main begin
Exception in thread "main" java.lang.NoClassDefFoundError: I
        at J.main(J.java:11)
Caused by: java.lang.ClassNotFoundException: I
        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
*/