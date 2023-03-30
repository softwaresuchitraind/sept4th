class X
{
		private static int i;
}
class D 
{
	public static void main(String[] args) 
	{
		System.out.println(X.i);
	}
}
/*
D.java:9: error: i has private access in X
                System.out.println(X.i);
                                    ^
1 error

i is private so cte
*/
