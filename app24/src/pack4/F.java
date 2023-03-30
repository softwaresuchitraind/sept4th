package pack4;
import pack3.A;
class  F extends A
{
	public static void main(String[] args) 
	{
		A a1= new A();
		//System.out.println(a1.i);
		//System.out.println(a1.j);
		System.out.println(a1.k);
		F f1= new F();
		//System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(f1.k);
	}
}

/*
usage is limited to current package not inherisatnce
f1.i is not possible as it is default can not access through inherisatnce
inside F class f1.j and f1.k is available as it is inheristance
protected and public members are inheriting to every subclass.
*/