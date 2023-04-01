class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}

/*

366712642
1829164700
hashCode() method returns integer format of Objects memory address.
-Inside class A ,Object class hashCode() method not overided.
-It is returning integer format of Objects memory address.

*/
