class M19
{
	public static void main(String[] args) 
	{
		A a1=new C();
		B b1=(B)a1;
		System.out.println(" done");
	}
}
/*
compile success
running success
B members are also available in a1.
C object contains A,B and C members

*/