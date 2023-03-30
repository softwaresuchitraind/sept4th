class A
{
	int i;
	A ref;
	
	A(int i)
	{
	 this.i=i;
	}
	A(int i,A parent)
	{
		this.i=i;
		parent.ref=this;//a1.ref=a2,a2.ref=a3
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1= new A(10);
		A a2=new A(20,a1);
		A a3=new A(30,a2);
		A a4=new A(40,a3);
		A a5=new A(50,a4);

		
		System.out.println(a1.i);
		System.out.println(a1.ref.i);
		System.out.println(a1.ref.ref.i);
		System.out.println(a1.ref.ref.ref.i);
		System.out.println(a1.ref.ref.ref.ref.i);
		
	}
}
/*
10
20
30
40
50

*/