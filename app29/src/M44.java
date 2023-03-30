class M44 
{
	public static void main(String[] args) 
	{
		A a1=new C();//upcasting------unable to use every member of object
		C c1=new C();//we are able to use every member
		System.out.println(a1.i);
		//System.out.println(a1.j);
		//System.out.println(a1.k);
		if(a1 instanceof C)
		{
			C obj=(C)a1;//downcasting
			System.out.println(obj.i);
			System.out.println(obj.j);
		}
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		
	}
}
/*
upcasting is used to achieve polymorphism
*/