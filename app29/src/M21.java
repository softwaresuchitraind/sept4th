class M21
{
	public static void main(String[] args) 
	{
		B b1=new B();
		C c1=(C)b1;//down casting required
		System.out.println(" ----------");
		D d1=(D)b1;
		System.out.println(" done");
	}
}

/*
B object can not be converted into C
While loading only B class loaded in memory
runtime exception
class cast exception
*/