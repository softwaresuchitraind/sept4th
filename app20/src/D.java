class C
{
	C()
	{
		//super clalling
		//iib calling
		System.out.println("C()");
	}
	{
	System.out.println("C-IIB");
	}
}
class  D extends C
{
	D()
	{
		//Super----calling C class
		//calling to iib D class
		System.out.println("D()");
	}
	{
		System.out.println("D-IIB");
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println(".........");
		D d1=new D();
		System.out.println(".........");
	}
}
/*
if any iib is there 
iib does n't call bacause of no name.
so we can not call explicitely.
Compiler developing calling statement to iib inside a
constuctor body after super();

{
super()
iib
constuctor body
}

if 1st statement is this then iib is not incorporated
*/