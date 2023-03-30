class M43 
{
	public static void main(String[] args) 
	{
		A a1=new C();//upcasting------unable to use every member of object
		C c1=new C();//we are able to use every member
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
	}
}
/*
cte
By using a1 we can not access j and k;
-upcasting------unable to use every member of object-- to access every member
we have to downcasting-before downcasting instance of is required
*/