class A
{
	int i;
}
class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i =10;

		A a2 = new A();
		a2.i =20;
		System.out.println(a1);
		System.out.println(a2);
	}
}
/*

A@15db9742
A@6d06d69c

*/