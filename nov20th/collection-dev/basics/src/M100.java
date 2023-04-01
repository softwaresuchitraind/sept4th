import java.util.ArrayList;
class M100
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9.5);
		list.add("abc");
		System.out.println(list);
		Object obj = list.get(1);
		System.out.println(obj);
		double d1 = (double)list.get(2);//string type we are downcast to double
		System.out.println(d1);
	}
}


/*

G:\nov20th\collection-dev\basics\src>java -cp ../classes M100
[90, 9.5, abc]
9.5
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Double
        at M100.main(M100.java:13)


add() and put() argument is object type.
compiler is unable to identify the type
that is whay it is giving compile time warnings

while reading we have to downcast it to proper type.
otherwise we get classcastException.


*/