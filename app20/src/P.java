class N
{
	static
	{
		System.out.println("N.SIB");

	}
	static int i;
	
}
class  O extends N
{
	static
	{
		System.out.println("O-SIB");
	}
	static int j;

}
class P
{

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(N.i);
		System.out.println("...........");
		System.out.println(O.j);
		System.out.println("Main End");
	}
}
//while using subclass if super class is nt loaded then it loaded to memory.
//if super class already loaded then it will not load again while calling subclass
