class M 
{
	int i;
	M()
	{
		i=200;
	}
	public static void main(String[] args) 
	{
		M obj1=new M();
		M obj2=new M();
		M obj3=new M();
		System.out.println(obj1.i+", "+obj2.i+", "+obj3.i);
		obj1.i=500;
		obj2.i=600;
		obj3.i=700;
		System.out.println(obj1.i+", "+obj2.i+", "+obj3.i);

	}
}
/*
for every object ceration through a constructor we are modifying the value.
*/