class Q 
{
	Q()
	{
		System.out.println("Q()");
	}
	{
		System.out.println("Q-IIB");
	}
	Q(int i)
	{
		this();
		System.out.println("Q-int");
	}
	Q(int i,int j)
	{
		this(i);
		System.out.println("Q(int,int)");
	}
	static
	{
		System.out.println("Q-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Q.main begin");
		Q q1= new Q();
		System.out.println(".............");
		Q q2= new Q(10);
		System.out.println(".............");
		Q q3= new Q(1,3);
		System.out.println(".............");
		Q q4= new Q(10,30);
		System.out.println("--------------");
		System.out.println("Q.main end");
	}
}
