class M47 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		System.out.println(sb);
	}
}
/*
StringBuffer
-----------
-StringBuffer is a concrete class available in the java.lang package
-It is a final class
-we can not develop a subclass to this
-Inside a StringBuffer Object class toString() only got overrided.
-hasCode() equals() method is not overided in the StringBuffer.
-StringBuffer implementing Serializable interface.
- We can serialize the StringBuffer Object.
-StringBuffer not implementing Comarable interface.
-StringBuffer Objects are mutable--changeable
-We can not create a StringBuffer object without a new Operator.
-We can not add any thing to the StringBuffer Object in the + operator.
-StringBuffer internally using Buffer memory to store the characters.
-Default buffer size is 16 .
- there is no concat()--only append()


*/
