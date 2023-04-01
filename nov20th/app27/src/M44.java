class M44 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		C c1 = new C();
		System.out.println(a1.i);
		//System.out.println(a1.j);
		//System.out.println(a1.k);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
	}
}
/*
through upcasting we can not access every member of object.
to access we have to use downcasting.
To avoid classcast exception we have to go for instanceof operator
In order to achive polimorphism we have to use upcasting.
*/
