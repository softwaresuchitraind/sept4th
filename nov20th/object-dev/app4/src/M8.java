class A
{

}
class M8
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = a1;
		A a3 = a2;
		a2 = null;
		a3 = null;
		a1 = null;
		System.out.println("done");
	}
}


/*

At which line object is getting abadoned ?
line-14

whenever last reference is removed object is becoing abadoned.
*/