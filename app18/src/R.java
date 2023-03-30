class R
{
	R()
	{
		System.out.println("R()");
	}
	{
		System.out.println("R-IIB");
	}
	R(int i)
	{
		this();
		System.out.println("R-int");
	}
	
	R(int i,int j)
	{
		this(i);
		System.out.println("R(int,int)");
	}
	static
	{
		System.out.println("R-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("R.main begin");
		R obj1 = new R();
		System.out.println(".............");
		R obj2 = new R(10);
		System.out.println(".............");
		R obj3 = new R(10,20);
		System.out.println(".............");
		R obj4 = new R(true);
		System.out.println("--------------");
		System.out.println("R.main end");
	}
}
