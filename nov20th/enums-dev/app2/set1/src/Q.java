class Q 
{
	public static void main(String[] args) 
	{
		Month p1 = Month.valueOf("JAN");
		System.out.println(p1);
		Month p2 = Month.valueOf("FEB");
		System.out.println(p2);
		Month p3 = Month.valueOf("JULY");
		System.out.println(p3);
	}
}

/*
JAN
FEB
Exception in thread "main" java.lang.IllegalArgumentException: No enum constant Month.JULY
        at java.lang.Enum.valueOf(Enum.java:238)
        at Month.valueOf(Month.java:1)
        at Q.main(Q.java:9)

- to check a particular constant is available or not -- if it is availble same is refered
----compiler list bothing about anything under double code
-so we get run time exception
-Only run time checks what is the content and how to use that.
- It is unchecked 

*/