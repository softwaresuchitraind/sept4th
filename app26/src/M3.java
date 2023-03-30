interface A
{
	static void test()
	{
		System.out.println("A.SIB");
	}
}
interface B extends A
{

}
class  M3
{
	public static void main(String[] args) 
	{
		B.test();
		System.out.println("done");
	}
}

/*
static methods only for that interface not for sub interfaces
github
greeksforgreeks
*/