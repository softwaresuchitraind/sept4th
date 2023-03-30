class E 
{
	E()
	{
		System.out.println("E()");
	}
	//instance initialization block<IIB>
	{
		System.out.println("E-IIB");
	}
	public static void main(String[] args) 
	{
		E e1=new E();
		System.out.println("-------");
		E e2=new E();
		System.out.println("-------");
	}
}
/*
two types of non static initializers
1---Constructor
2---IIB
> cd ../..
*/