class M13 
{
	public static void main(String[] args) 
	{
		StringBuffer obj1 = new StringBuffer("abc");
		StringBuffer obj2 = new StringBuffer("abc");
		StringBuilder obj3 = new StringBuilder("abc");
		StringBuilder obj4 = new StringBuilder("abc");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
	}
}

/*
in stringnbuffer and String Builder equals() not overided

G:\nov20th\object-dev\app2\src>java -cp ../classes M13
false
false
*/
