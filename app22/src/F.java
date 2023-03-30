interface F
{
	 int i=10;
	 void test1();//  abstract void test1();
	
}

//Constants and abstact method are allowed
//by default every member of the interface is public
//   F is not public, only i and test1() are public
// every constant is a static and final is along with the public
// i is public static final
//by fefault every method of interface is abstarct and public.

/*
every member of the interface is a public.
every static and final member should be initialized.
-interfaces are developed for encapsulating public members.

-By defalut all members of the interface is public but
interface itself is not public --if u want to make it
public specify explicitely.



public interface F
{
	 int i=10;
	 void test1();
	
}

*/