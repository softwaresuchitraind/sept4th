class H 
{
	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
	}
}
/*
1
Exception in thread "main" java.lang.ClassNotFoundException:
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Class.java:264)
        at H.main(H.java:6)

cs----------because of throws in stead of try and catch
re
*/