class A
{
	int i;
	A ref;
	
	A(int i)
	{
	 this.i=i;
	}
	A(int i,A root)
	{
		this.i=i;
		A current=root;
		while(current.ref !=null)
		{
			current=current.ref;
		}
		current.ref=this;//a1.ref=a2,a.ref=a3
	}
}
class M6
{
	public static void main(String[] args) 
	{
		A a1= new A(10);//1---ref==null
		new A(20,a1);//2---root=a1
		new A(30,a1);
		new A(40,a1);
		new A(50,a1);

		
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