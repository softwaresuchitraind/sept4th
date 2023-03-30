class G 
{
	int i;
	static int j;
	void test()
	{
		System.out.println(i+ ","+j);
	}
	public static void main(String[] args) 
	{
		G g1= new G();
		System.out.println(g1.i+ ","+j);
		g1.test();

	}
}
/*
We are not getting compile time error with respect to j as static members can be used anywhere.
Inside non static method we can use any members of current class.
-----basics of class and objects......
next ----constructor

*/
