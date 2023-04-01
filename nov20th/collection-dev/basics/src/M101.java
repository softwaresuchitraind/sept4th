import java.util.ArrayList;

@SuppressWarnings("unchecked")
class M101
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
		double d1 = (double)list.get(2);
		System.out.println(d1);
	}
}


/*
cs----without andWarnings



G:\nov20th\collection-dev\basics\src>java -cp ../classes M101
[90, 9.5, abc]
9.5
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Double
        at M101.main(M101.java:15)

*/