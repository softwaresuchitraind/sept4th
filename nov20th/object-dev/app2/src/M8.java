class A
{
	int i;
	int j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public boolean equals(Object obj)
	{
		return (i ==((A)obj).i && j ==((A)obj).j);
	}
}
class B 
{
	int m;
	int n;
	A element;
	String s1;
	B(int m, int n)
	{
		this.m = m;
		this.n = n;
	}
	public boolean equals(Object obj)
	{
		boolean status = 
		(element == null ? (((B)obj).element == null ? true : false) :
			(((B)obj).element == null ? false :
				element.equals(((B)obj).element))) &&
		

		(s1 == null ? (((B)obj).s1 == null ? true : false) :
			(((B)obj).s1 == null ? false :
				s1.equals(((B)obj).s1))) &&


			(m ==((B)obj).m &&
			n == ((B)obj).n);

			return status;
	}
}
class M8
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,500);
		A a2 = new A(90,500);
		System.out.println(a1.equals(a2));
		B b1 = new B(30, 50);
		B b2 = new B(30, 50);
		B b3 = new B(30, 50);
		B b4 = new B(30, 50);
		
		b1.element = a1;
		b2.element = a2;

		b3.s1 = "hello";
		b4.s1 = "hello";
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(b1.equals(b4));
		System.out.println(b2.equals(b3));
		System.out.println(b2.equals(b4));
		System.out.println(b3.equals(b4));
		System.out.println(b4.equals(b1));
		System.out.println(b4.equals(b2));
		System.out.println(b4.equals(b3));
	
	}
}

/*
true
true
false
false
false
false
true
false
false
true
*/