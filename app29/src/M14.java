class M14 
{
	static B test(A obj)
	{
		return obj;
	}
	public static void main(String[] args) 
	{
		Object obj1=new E();
		C obj2=test(obj1);
		System.out.println("Hello World!");
	}
}


/*
M14.java:5: error: incompatible types: A cannot be converted to B
                return obj;
                       ^
M14.java:10: error: incompatible types: Object cannot be converted to A
                C obj2=test(obj1);
                            ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors
*/