class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj=new Object();
		E e1=(E)obj;
		System.out.println("main End");
	}
}
/*
E is a subclass to object class.We are trying to downcasting E.
classCastException


main begin
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to E
        at E.main(E.java:7)
*/