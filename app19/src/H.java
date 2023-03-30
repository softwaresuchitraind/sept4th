class G
{
	static void test1()
	{
			System.out.println("from test1");
	}
}
class H extends G
{
	static void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		H.test1();
		H.test2();
		System.out.println("done");
	}
}
/*
from test1
from test2
done
*/