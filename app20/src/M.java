class K
{
	static
	{
		System.out.println("K.SIB");

	}
	
}
class  L extends K
{
	static
	{
		System.out.println("L-SIB");
	}
	static int i;

}
class M
{

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(L.i);
		System.out.println("Main End");
	}
}
