class R 
{
	enum En
	{
		c1, c2, c3, c4;
	}
}
class S 
{
	public static void main(String[] args) 
	{
		R.En e1 = R.En.c4;
		R.En e2 = R.En.c2;
		System.out.println(e1);
		System.out.println(e2);
	}
}

/*
c4
c2
-What ever enum is defined how to use that.
-Enum of one class using in another class.

*/
