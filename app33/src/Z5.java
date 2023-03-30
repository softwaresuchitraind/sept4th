interface A
{
	int i;
}
class  Z5
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
}
/*
Z5.java:3: error: = expected
        int i;
             ^
1 error
-Interface filed should be initialized as it is final and static.
-it should be initialized by declaring.
-if we are not initializing we get compile time error.
*/